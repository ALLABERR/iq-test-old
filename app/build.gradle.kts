plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
}

android {
    namespace = "ru.allaber.iq"
    compileSdk = ConfigData.compileSdk

    defaultConfig {
        applicationId = "ru.allaber.iq"
        minSdk = ConfigData.minSdk
        targetSdk = ConfigData.targetSdk
        versionCode = ConfigData.versionCode
        versionName = ConfigData.versionName
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(ConfigData.proguardAndroid),
                ConfigData.proguardRules
            )
        }
    }
    compileOptions {
        sourceCompatibility = ConfigData.sourceCompatibility
        targetCompatibility = ConfigData.targetCompatibility
    }
    kotlinOptions {
        jvmTarget = ConfigData.jvmTarget
    }
}

dependencies {
    implementation(projects.ui.assets)
    implementation(projects.ui.localization)
    implementation(projects.ui.system)
    implementation(projects.core.navigation)
    implementation(projects.feature.home)
    implementation(projects.feature.intro)

    implementation(Deps.coreKtx)
    implementation(Deps.appcompat)
    implementation(Deps.constraintLayout)
    implementation(Deps.lottie)
}
