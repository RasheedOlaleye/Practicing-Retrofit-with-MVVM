package com.example.networking.Api

import com.example.networking.model.post
import retrofit2.http.GET

interface ApiService {
    @GET("posts/1")
    suspend fun getpost():post


}


