plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.ezzdigi.ezzgameboost"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.ezzdigi.ezzgameboost"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }
}
