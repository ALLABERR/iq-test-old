import org.gradle.api.JavaVersion

object ConfigData {
    const val compileSdk = 33
    const val minSdk = 24
    const val targetSdk = 33
    const val versionCode = 1
    const val versionName = "1.0"
    const val jvmTarget = "17"

    val sourceCompatibility = JavaVersion.VERSION_17
    val targetCompatibility = JavaVersion.VERSION_17

    const val proguardAndroid = "proguard-android-optimize.txt"
    const val proguardRules = "proguard-rules.pro"
}
