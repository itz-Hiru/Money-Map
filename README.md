# 💰 Money Map Expense Tracker

## 🌟 Project Overview

An advanced Android application designed to provide comprehensive personal finance management, tracking, and visualization.

### 🛠 Tech Stack

![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)
![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white)

### 📚 Key Libraries

- 🧭 **Navigation UI**: Seamless app navigation
- 📊 **MPAndroidChart**: Advanced data visualization
- 🖼️ **Glide**: Efficient image loading and caching
- 📸 **Image Picker**: Simplified image selection
- 🎠 **Image Carousel**: Dynamic image display

## ✨ Key Features

- 💸 Comprehensive Expense Tracking
- 📊 Interactive Financial Visualizations
- 🗂️ Category-based Expense Management
- 📈 Detailed Financial Reports
- 🖼️ Image-Enhanced Transaction Logging
- 🧭 Intuitive User Interface

## 🚀 Getting Started

### Prerequisites

- Android Studio
- Java Development Kit (JDK)
- Android SDK

### Installation

1. Clone the repository
   ```bash
   git clone https://github.com/itz-Hiru/Money-Map.git
   ```

2. Open in Android Studio
    - File > Open > Select project directory

3. Build Project
    - Let Android Studio resolve dependencies
    - Sync Gradle files

## 🔧 Project Dependencies

Add these to your `build.gradle` (Module level):
```groovy
dependencies {
    // Navigation UI
    implementation 'androidx.navigation:navigation-fragment:2.5.3'
    implementation 'androidx.navigation:navigation-ui:2.5.3'
    
    // MPAndroidChart
    implementation 'com.github.PhilJay:MPAndroidChart:v3.1.0'
    
    // Glide
    implementation 'com.github.bumptech.glide:glide:4.12.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'
    
    // Image Picker
    implementation 'com.github.dhaval2404:imagepicker:2.1.0'
    
    // Image Carousel
    implementation 'androidx.viewpager2:viewpager2:1.1.0'
}
```

## 🌐 App Architecture

```
money-map/
│
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/hirumitha/moneymap/
│   │   │   │       ├── activities/
│   │   │   │       ├── adapters/
│   │   │   │       ├── database/
│   │   │   │       ├── fragments/
│   │   │   │       ├── models/
│   │   │   │       ├── utils/
│   │   │   │       └── viewmodels/
│   │   │   └── res/
│   │   │       ├── color/
│   │   │       ├── drawable/
│   │   │       └── font/
│   │   │       └── layout/
│   │   │       └── menu/
│   │   │       └── mipmap/
│   │   │       └── navigation/
│   │   │       └── values/
│   │   │       └── xml/
│
├── gradle/
├── .gitignore
├── LICENSE
└── README.md
```

## 🖥️ Core Functionality

1. **Expense Tracking**
    - Add, edit, delete transactions
    - Categorize expenses
    - Attach images to transactions

2. **Visualization**
    - Pie charts of expense distribution
    - Line graphs of spending trends
    - Customizable financial reports

3. **Image Integration**
    - Receipt and transaction image uploads
    - Image carousel for transaction history
    - Efficient image management with Glide

## 🛠️ Build and Run

### Using Android Studio

1. Open the project
2. Connect Android device or start emulator
3. Click "Run" (Green play button)

### Command Line

```bash
# Assemble debug APK
./gradlew assembleDebug

# Install on connected device
./gradlew installDebug
```

## 🤝 How to Contribute

1. Fork the Project
2. Create Feature Branch (`git checkout -b feature/FinanceFeature`)
3. Commit Changes (`git commit -m 'Add transaction image feature'`)
4. Push to Branch (`git push origin feature/FinanceFeature`)
5. Open Pull Request

## 🔒 Data Privacy

- Local database storage
- No mandatory cloud sync
- Secure transaction tracking

## 📊 Performance Optimization

- Efficient chart rendering with MPAndroidChart
- Optimized image loading with Glide
- Minimal resource consumption

## 📱 Supported Android Versions

- Minimum SDK: Android 6.0 (Marshmallow)
- Target SDK: Android 12

## 📧 Connect & Support

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/hirumitha)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/itz-Hiru)
[![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:hirumithakuladewanew@gmail.com)

## 📄 License

Distributed under the MIT License. See `LICENSE` for more information.

---

🌈 **Transforming Personal Finance Management** 💸

![Visitor Count](https://visitor-badge.laobi.icu/badge?page_id=itz-Hiru.Money-Map)