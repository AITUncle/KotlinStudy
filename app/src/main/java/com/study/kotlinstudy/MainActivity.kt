package com.study.kotlinstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

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

        //上下文切换到IO主线程
        GlobalScope.launch(Dispatchers.IO) {
            Log.i(TG, "Dispatchers.IO isMainThread ${isMain()}")//输出false

            //上下文切换到主线程
            GlobalScope.launch(Dispatchers.Main){
                Log.i(TG, "Dispatchers.Main isMainThread ${isMain()}")//输出true
            }

        }
    }
}
