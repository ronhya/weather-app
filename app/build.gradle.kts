plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-parcelize")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs.kotlin")
    id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin")
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "com.challenge.weather"
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        getByName("debug") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"

        freeCompilerArgs = freeCompilerArgs + listOf(
            // Enable experimental coroutines APIs, including Flow
            "-Xopt-in=kotlinx.coroutines.ExperimentalCoroutinesApi"
        )
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.4.1")
    implementation("com.google.android.material:material:1.5.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.3")
    implementation("com.jakewharton.timber:timber:5.0.1")
    implementation("io.insert-koin:koin-android:3.1.2")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.google.code.gson:gson:2.8.8")
    implementation("androidx.navigation:navigation-fragment-ktx:2.4.0")
    implementation("androidx.navigation:navigation-ui-ktx:2.4.0")
    implementation("com.github.chuckerteam.chucker:library:3.5.2")
    implementation("androidx.room:room-runtime:2.4.1")
    implementation("androidx.room:room-ktx:2.4.1")
    implementation("com.facebook.stetho:stetho:1.6.0")
    implementation("io.coil-kt:coil:1.4.0")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.6.0")
    implementation("com.google.android.libraries.places:places:2.5.0")

    kapt("androidx.room:room-compiler:2.4.1")

    testImplementation("junit:junit:4.13.2")
    testImplementation("org.mockito:mockito-core:4.5.1")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.0")

    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")

}