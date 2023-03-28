object Versions {

    const val kotlin = "1.6.0"
    const val coreKtx = "1.7.0"
    const val material = "1.6.0"
    const val navigation = "2.5.3"

    // Build Config
    const val minSDK = 23
    const val compileSDK = 33
    const val targetSDK = 33

    // App version
    const val appVersionCode = 1
    const val appVersionName = "1.0.0"

    // Plugins
    const val androidGradlePlugin = "3.1.3"

    // Support Lib
    // const val support = "27.1.1"
    // Comment above and uncomment below to cause conflict in dependency
    const val support = "26.0.2"
    const val constraintLayout = "2.0.4"


    // Testing
    const val junit = "4.12"
    const val espresso = "3.0.2"
    const val testRunner = "1.0.2"
    const val testExtJunit = "1.1.5"
}


object Deps {

    // Plugins
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    // Support Library
    const val supportAnnotations = "com.android.support:support-annotations:${Versions.support}"
    const val constraintLayout = "com.android.support.constraint:constraint-layout:${Versions.constraintLayout}"

    // Testing
    const val junit = "junit:junit:${Versions.junit}"
    const val testExtJunit = "androidx.test.ext:junit:${Versions.testExtJunit}"
    const val espressoCore = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
    const val testRunner = "com.android.support.test:runner:${Versions.testRunner}"

    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.kotlin}"
    const val material = "androidx.appcompat:appcompat:${Versions.material}"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
}

