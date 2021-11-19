package com.gsixacademy.android.bikebransys.api

import retrofit2.Call
import com.gsixacademy.android.bikebransys.models.BikeResponce
import retrofit2.http.GET



interface BikesApi {
    @GET("networks")
    fun getBikes():Call<BikeResponce>
}