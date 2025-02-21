// build.gradle.kts (App-level) ✅ REMOVE repositories
plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    namespace = "com.safeword"
    compileSdk = 34
    buildFeatures {
        viewBinding = true
    }
    defaultConfig {
        applicationId = "com.safeword"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    kotlinOptions {
        jvmTarget = "21"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.activity:activity-ktx:1.7.0")
    implementation("androidx.fragment:fragment-ktx:1.5.7")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.lifecycle:lifecycle-service:2.6.1")
    implementation("androidx.navigation:navigation-fragment-ktx:2.6.0")
    implementation("androidx.navigation:navigation-ui-ktx:2.6.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
}
