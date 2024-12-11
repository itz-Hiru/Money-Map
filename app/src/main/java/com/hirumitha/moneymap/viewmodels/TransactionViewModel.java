package com.hirumitha.moneymap.viewmodels;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.List;

import com.hirumitha.moneymap.database.FinanceDatabaseHelper;
import com.hirumitha.moneymap.models.Transaction;

public class TransactionViewModel extends AndroidViewModel {

    private final MutableLiveData<List<Transaction>> transactions;
    private final MutableLiveData<Double> totalIncome;
    private final MutableLiveData<Double> totalExpense;
    private final FinanceDatabaseHelper financeDatabaseHelper;

    public TransactionViewModel(@NonNull Application application) {
        super(application);
        financeDatabaseHelper = new FinanceDatabaseHelper(application);
        transactions = new MutableLiveData<>();
        totalIncome = new MutableLiveData<>();
        totalExpense = new MutableLiveData<>();
        loadTransactions();
        updateTotals();
    }

    public LiveData<List<Transaction>> getTransactions() {
        return transactions;
    }

    public LiveData<Double> getTotalIncome() {
        return totalIncome;
    }

    public LiveData<Double> getTotalExpense() {
        return totalExpense;
    }

    private void loadTransactions() {
        List<Transaction> transactionList = financeDatabaseHelper.getAllTransactions();
        transactions.setValue(transactionList);
        updateTotals();
    }

    public void addTransaction(String type, String category, double amount, String date) {
        if (financeDatabaseHelper.addTransaction(type, category, amount, date)) {
            loadTransactions();
        }
    }

    public boolean deleteTransaction(int id) {
        if (financeDatabaseHelper.deleteTransaction(id)) {
            loadTransactions();
            return true;
        }
        return false;
    }

    private void updateTotals() {
        double income = 0;
        double expense = 0;
        List<Transaction> transactionList = transactions.getValue();

        if (transactionList != null) {
            for (Transaction transaction : transactionList) {
                if ("Income".equals(transaction.getType())) {
                    income += transaction.getAmount();
                } else if ("Expense".equals(transaction.getType())) {
                    expense += transaction.getAmount();
                }
            }
        }

        totalIncome.setValue(income);
        totalExpense.setValue(expense);
    }
}