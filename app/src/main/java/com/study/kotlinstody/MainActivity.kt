package com.study.kotlinstody

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.util.Log
import kotlinx.coroutines.*
import java.lang.Runnable

class MainActivity : AppCompatActivity() {
    companion object {
        const val TG = "vz-MainActivity"
    }

    private fun isMain():Boolean{
        return Looper.getMainLooper() == Looper.myLooper()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch(Dispatchers.Main){
            Log.i(TG, "Dispatchers.Main isMainThread ${isMain()}")
        }

        GlobalScope.launch(Dispatchers.IO) {
            Log.i(TG, "Dispatchers.IO isMainThread ${isMain()}")
        }
    }
}
