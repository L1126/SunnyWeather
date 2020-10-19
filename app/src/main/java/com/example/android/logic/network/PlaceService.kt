package com.example.android.logic.network

import com.example.android.SunnyWeatherApplication
import com.example.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CH")
    fun searchPlaces(@Query("query") query:String):Call<PlaceResponse>
}
