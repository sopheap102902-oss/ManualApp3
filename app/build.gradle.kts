plugins {
    id("com.android.application") version "8.2.0" apply true
}

android {
    namespace = "com.sopheap.app"
    compileSdk = 30

    defaultConfig {
        applicationId = "com.sopheap.app"
        minSdk = 21
        targetSdk = 30
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

