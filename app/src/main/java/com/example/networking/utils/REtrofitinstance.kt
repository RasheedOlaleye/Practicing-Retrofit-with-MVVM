package com.example.networking.utils

import com.example.networking.Api.ApiService
import com.example.networking.utils.constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object REtrofitinstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

        val api:ApiService by lazy{
            retrofit.create(ApiService::class.java)
        }





}