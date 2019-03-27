import Versions.kotlin_version

object Config {

    const val applicationTag = "Doggo"
    const val applicationNameAlias = "Doggo_App" // Don't change! Seriously! Don't!
}

object Versions {

    // google
    const val play_services_version = "16.0.0"
    const val support_lib_version = "27.1.1"
    const val arch_components_version = "1.1.1"
    const val libphonenumber_version = "8.10.1"
    const val constraintlayout_version = "1.1.0"
    const val crashytics_version = "2.9.3"
    const val arch_components_paging_lib_version = "1.0.0"
    const val exoplayer_version = "2.7.1"
    const val kotlin_version = "1.3.11"

    //test
    const val power_mock_version = "2.0.0-beta.5"
    const val mockito_version = "2.12.0"
    const val junit_version = "4.12"
    const val hamcrest_version = "1.3"
    const val espresso_version = "3.0.1"
    const val ui_automator_version = "2.1.2"
    const val dex_maker_version = "1.4"
    const val test_runner_version = "0.5"
    const val google_truth_version = "0.36"
    const val roboelectric_version = "3.5.1"
    const val mockito_kotlin_version = "1.5.0"

    //network
    const val gson_version = "2.8.1"
    const val retrofit_version = "2.3.0"

    //quality
    const val stetho_version = "1.5.0"
    const val ktlint_version = "0.20.0"
    const val error_prone_version = "2.1.3"
    const val findbugs_version = "3.0.1"
    const val leak_canary_version = "1.5.4"

    //dev
    const val okhttp_version = "3.8.0"
    const val rx_java_version = "2.1.0"
    const val rx_android_version = "2.0.1"
    const val dagger_version = "2.15"

    // analytics and notifications
    const val install_referrer_version = "1.0"

    const val fresco_version = "1.9.0"
    const val photodrawee_version = "1.1.3"
    const val mockk_version = "1.8.4"
    const val room_version = "1.1.0"

    const val firebase_core_version = "16.0.4"
    const val firebase_auth_version = "16.0.4"
    const val firebase_config_version = "16.0.1"
    const val firebase_database_version = "16.0.3"
    const val firebase_storage_version = "16.0.3"
    const val firebase_perf_version = "16.1.2"
    const val firebase_messaging_version = "17.3.4"
    const val firebase_dispatcher_version = "0.8.5"
    const val coroutines_version = "1.1.0"
    const val coroutines_rx2_version = "1.0.0"
}

object Plugins {
    const val jacoco = "jacoco"
    const val errorProne = "net.ltgt.errorprone"
    const val fabric = "io.fabric"
}

object AnnotationCompilers {
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger_version}"
    const val daggerAndroidProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger_version}"
    const val archLifecylerCompiler = "android.arch.lifecycle:compiler:${Versions.arch_components_version}"
    const val roomProcessor = "android.arch.persistence.room:compiler:${Versions.room_version}"
}

object LibrariesAllProjects {
    const val kotlinAndroid = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
    const val fabric = "io.fabric.tools:gradle:1.25.4"
    const val jacoco = "org.jacoco:org.jacoco.core:0.8.1"
    const val errorProne = "net.ltgt.gradle:gradle-errorprone-plugin:0.0.14"
    const val firebase = "com.google.firebase:firebase-plugins:1.1.5"
    const val googleServices = "com.google.gms:google-services:4.1.0"
}

object Libraries {
    const val design = "com.android.support:design:${Versions.support_lib_version}"
    const val supportv4 = "com.android.support:support-v4:${Versions.support_lib_version}"
    const val appcompatv7 = "com.android.support:appcompat-v7:${Versions.support_lib_version}"
    const val cardview = "com.android.support:cardview-v7:${Versions.support_lib_version}"
    const val recyclerview = "com.android.support:recyclerview-v7:${Versions.support_lib_version}"
    const val annotations = "com.android.support:support-annotations:${Versions.support_lib_version}"
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin_version}"
    const val constraintlayout = "com.android.support.constraint:constraint-layout:${Versions
        .constraintlayout_version}"

    // Firebase and play services
    const val playGcm = "com.google.android.gms:play-services-gcm:${Versions.play_services_version}"
    const val playLocation = "com.google.android.gms:play-services-location:${Versions
        .play_services_version}"
    const val playMaps = "com.google.android.gms:play-services-maps:${Versions.play_services_version}"
    const val playPlus = "com.google.android.gms:play-services-plus:${Versions.play_services_version}"
    const val playPlaces = "com.google.android.gms:play-services-places:${Versions.play_services_version}"
    const val playAuth = "com.google.android.gms:play-services-auth:${Versions.play_services_version}"
    const val playAuthApiPhone = "com.google.android.gms:play-services-auth-api-phone:${Versions
        .play_services_version}"
    const val playIdentity = "com.google.android.gms:play-services-identity:${Versions
        .play_services_version}"
    const val firebaseStorage = "com.google.firebase:firebase-storage:${Versions.firebase_storage_version}"
    const val firebaseAuth = "com.google.firebase:firebase-auth:${Versions.firebase_auth_version}"
    const val firebaseDatabase = "com.google.firebase:firebase-database:${Versions.firebase_database_version}"
    const val firebaseMessaging = "com.google.firebase:firebase-messaging:${Versions.firebase_messaging_version}"
    const val firebaseConfig = "com.google.firebase:firebase-config:${Versions.firebase_config_version}"
    const val firebaseCore = "com.google.firebase:firebase-core:${Versions.firebase_core_version}"
    const val firebasePerf = "com.google.firebase:firebase-perf:${Versions.firebase_perf_version}"
    const val firebaseJobDispatcher = "com.firebase:firebase-jobdispatcher:${Versions.firebase_dispatcher_version}"

    // Architecture components
    const val archComponents = "android.arch.lifecycle:extensions:${Versions.arch_components_version}"
    const val archComponentsReactive = "android.arch.lifecycle:reactivestreams:${Versions.arch_components_version}"
    const val archComponentsPaging = "android.arch.paging:runtime:${Versions.arch_components_paging_lib_version}"
    const val room = "android.arch.persistence.room:runtime:${Versions.room_version}"
    const val roomRx = "android.arch.persistence.room:rxjava2:${Versions.room_version}"

    const val dagger = "com.google.dagger:dagger:${Versions.dagger_version}"
    const val daggerAndroid = "com.google.dagger:dagger-android:${Versions.dagger_version}"
    const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger_version}"
    const val rxjavaAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rx_android_version}"
    const val rxjava = "io.reactivex.rxjava2:rxjava:${Versions.rx_java_version}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit_version}"
    const val retrofitGsonConvertor = "com.squareup.retrofit2:converter-gson:${Versions.retrofit_version}"
    const val retrofitRxJavaAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit_version}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp_version}"
    const val okhttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp_version}"
    const val gson = "com.google.code.gson:gson:${Versions.gson_version}"
    const val crashlytics = "com.crashlytics.sdk.android:crashlytics:${Versions.crashytics_version}"
    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leak_canary_version}"
    const val leakCanaryNoOp = "com.squareup.leakcanary:leakcanary-android-no-op:${Versions.leak_canary_version}"
    const val errorprone = "com.google.errorprone:error_prone_core:${Versions.error_prone_version}"
    const val libPhoneNumber = "com.googlecode.libphonenumber:libphonenumber:${Versions.libphonenumber_version}"
    const val exoplayer = "com.google.android.exoplayer:exoplayer-core:${Versions.exoplayer_version}"
    const val exoplayerUi = "com.google.android.exoplayer:exoplayer-ui:${Versions.exoplayer_version}"
    const val ktlint = "com.github.shyiko:ktlint:${Versions.ktlint_version}"
    const val fresco = "com.facebook.fresco:fresco:${Versions.fresco_version}"
    const val frescoPhotoDrawee = "me.relex:photodraweeview:${Versions.photodrawee_version}"
    const val frescoImagePipeline = "com.facebook.fresco:imagepipeline-okhttp3:${Versions.fresco_version}"
    const val installReferrer = "com.android.installreferrer:installreferrer:${Versions.install_referrer_version}"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines_version}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines_version}"
    const val coroutinesRx2 = "org.jetbrains.kotlinx:kotlinx-coroutines-rx2:${Versions.coroutines_rx2_version}"
}

object TestLibraries {
    const val junit = "junit:junit:${Versions.junit_version}"
    const val mockitoCore = "org.mockito:mockito-core:${Versions.mockito_version}"
    const val mockitoInline = "org.mockito:mockito-inline:${Versions.mockito_version}"
    const val mockitoKotlin = "com.nhaarman:mockito-kotlin-kt1.1:${Versions.mockito_kotlin_version}"
    const val mockitoAndroid = "org.mockito:mockito-android:${Versions.mockito_version}"
    const val hamcrestAll = "org.hamcrest:hamcrest-all:${Versions.hamcrest_version}"
    const val powermockMockito = "org.powermock:powermock-api-mockito2:${Versions.power_mock_version}"
    const val powermockJunit4 = "org.powermock:powermock-module-junit4:${Versions.power_mock_version}"
    const val googleTruth = "com.google.truth:truth:${Versions.google_truth_version}"
    const val roboelectric = "org.robolectric:robolectric:${Versions.roboelectric_version}"
    const val archCoreTesting = "android.arch.core:core-testing:${Versions.arch_components_version}"
    const val supportTestRunner = "com.android.support.test:runner:${Versions.test_runner_version}"
    const val supportTestRules = "com.android.support.test:rules:${Versions.test_runner_version}"
    const val espressoIntents = "com.android.support.test.espresso:espresso-intents:${Versions.espresso_version}"
    const val espressoCore = "com.android.support.test.espresso:espresso-core:${Versions.espresso_version}"
    const val espressoContrib = "com.android.support.test.espresso:espresso-contrib:${Versions.espresso_version}"
    const val espressoIdlingResource =
        "com.android.support.test.espresso:espresso-idling-resource:${Versions.espresso_version}"
    const val dexmaker = "com.crittercism.dexmaker:dexmaker:${Versions.dex_maker_version}"
    const val dexmakerDx = "com.crittercism.dexmaker:dexmaker-dx:${Versions.dex_maker_version}"
    const val dexmakerMockito = "com.crittercism.dexmaker:dexmaker-mockito:${Versions.dex_maker_version}"
    const val uiAutomator = "com.android.support.test.uiautomator:uiautomator-v18:${Versions.ui_automator_version}"
    const val okhttpMockWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.okhttp_version}"
    const val findBugs = "com.google.code.findbugs:jsr305:${Versions.findbugs_version}"
    const val stetho = "com.facebook.stetho:stetho:${Versions.stetho_version}"
    const val retrofitMock = "com.squareup.retrofit2:retrofit-mock:${Versions.retrofit_version}"
    const val mockk = "io.mockk:mockk:${Versions.mockk_version}"
}
