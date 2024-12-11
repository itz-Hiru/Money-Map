package com.hirumitha.moneymap.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.hirumitha.moneymap.R;
import com.hirumitha.moneymap.database.AppLockDatabaseHelper;
import com.hirumitha.moneymap.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_PIN = 1;

    private ActivityMainBinding binding;
    private AppLockDatabaseHelper dbHelper;
    private SQLiteDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dbHelper = new AppLockDatabaseHelper(this);
        database = dbHelper.getReadableDatabase();

        proceedWithAppFlow();
    }

    private void proceedWithAppFlow() {
        if (isPinRequired()) {
            Intent intent = new Intent(this, PinEntryActivity.class);
            startActivityForResult(intent, REQUEST_PIN);
        } else {
            setupUI();
        }
    }

    private boolean isPinRequired() {
        Cursor cursor = null;
        boolean pinRequired = false;
        try {
            cursor = database.query(
                    AppLockDatabaseHelper.TABLE_NAME,
                    new String[]{AppLockDatabaseHelper.COLUMN_PIN},
                    AppLockDatabaseHelper.COLUMN_LOCK_TYPE + " = ?",
                    new String[]{"PIN"},
                    null,
                    null,
                    null
            );

            if (cursor != null && cursor.moveToFirst()) {
                @SuppressLint("Range") String storedPin = cursor.getString(cursor.getColumnIndex(AppLockDatabaseHelper.COLUMN_PIN));
                pinRequired = !TextUtils.isEmpty(storedPin);
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return pinRequired;
    }

    private void setupUI() {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupWithNavController(navView, navController);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_PIN) {
            if (resultCode == RESULT_OK) {
                setupUI();
            } else {
                finish();
            }
        }
    }
}