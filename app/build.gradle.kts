plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    kotlin("kapt") // using KAPT
    alias(libs.plugins.hilt.android)
}

android {
    namespace = "com.example.horrizontalorder"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.horrizontalorder"
        minSdk = 24
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    val hilt_version = "2.4.7"
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation("com.google.dagger:hilt-android:$hilt_version") // Use the latest version
    kapt("com.google.dagger:hilt-compiler:$hilt_version")


    implementation(libs.room.runtime)         // room local database
    annotationProcessor(libs.room.compiler)
    kapt(libs.room.kapt)

}
apply(plugin = "dagger.hilt.android.plugin")