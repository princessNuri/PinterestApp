package com.example.pinterestapp

import android.app.Application

class App:Application() {

    companion object{

        lateinit var api:PinApi
    }
    override fun onCreate() {
        super.onCreate()
        val retrofitService = RetrofitService()
        api=retrofitService.getApi()
    }
}