package com.example.networking.Repository

import com.example.networking.model.post
import com.example.networking.utils.REtrofitinstance

class Repository {
    suspend fun getpost(): post {
       return REtrofitinstance.api.getpost()
    }
}