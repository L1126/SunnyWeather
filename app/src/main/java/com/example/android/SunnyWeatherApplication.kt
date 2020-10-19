package com.example.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication:Application() {

    companion object{
        const val TOKEN="0nBoI4wEKzDNbBYv"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate(){
        super.onCreate()
        context=applicationContext
    }
}