import com.android.build.api.dsl.AaptOptions

plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.evie"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.evie"
        minSdk = 34
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    aaptOptions {
        noCompress ("model.tflite")
    }
}

dependencies {
    //implementation ("com.mapbox.mapboxsdk:mapbox-android-sdk:8.0.0")
    implementation ("com.mapbox.mapboxsdk:mapbox-sdk-services:6.15.0")
    implementation("com.mapbox.maps:android:10.15.0")
    implementation ("com.google.mediapipe:tasks-vision:latest.release")
    //implementation("com.mapbox.navigation:android: 10.15.0")
    // If you're using compose also add the compose extension
    // implementation("com.mapbox.extension:maps-compose:$CONSTANTS::MAP_SDK_VERSION")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.android.gms:play-services-maps:18.2.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("com.mapbox.navigation:android:2.15.2")
    implementation ("androidx.camera:camera-camera2:1.3.1")
    implementation ("androidx.camera:camera-lifecycle:1.3.1")
    implementation ("androidx.camera:camera-view:1.4.0-alpha04")

    // Add the following ML Kit dependencies
    implementation ("com.google.mlkit:object-detection-custom:17.0.1")

}