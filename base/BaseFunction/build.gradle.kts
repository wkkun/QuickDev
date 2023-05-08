plugins {
    id("convention.android.library")
}

android {
    namespace = "com.example.basefunction"
}

dependencies {
    api(libs.appcompat)
    api(libs.androidxCore)
    api(libs.material)
    //初始化
    api(libs.startup)
    //存储
    api(libs.mmkv)
    //图片
    api(libs.glide)
    //json
    api(libs.gson)
    //网络
    api(libs.okhttp)
    api(libs.retrofit2)
    api(libs.retrofit2Gson)
    api(libs.retrofit2Scalars)
    //协程
    api(libs.bundles.coroutines)
    api(libs.lifecycleKtx)
    api(libs.livedataKtx)
    api(libs.viewmodelKtx)

    api(project(":ScreenSupport"))
}