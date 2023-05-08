plugins {
    id("convention.android.library")
}

android {
    namespace = "com.example.util"
}

dependencies {

    implementation("androidx.core:core-ktx:1.8.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
}