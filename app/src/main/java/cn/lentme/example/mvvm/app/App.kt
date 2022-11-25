package cn.lentme.example.mvvm.app

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import java.util.concurrent.Executors

class App: Application() {

    companion object {
        lateinit var instance: Application
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        // Start Koin
        startKoin{
            androidLogger()
            androidContext(this@App)
            modules(appModule)
        }
    }

}
