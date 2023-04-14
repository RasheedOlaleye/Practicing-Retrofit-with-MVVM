package com.example.networking

import androidx.compose.runtime.MutableState
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.networking.Repository.Repository
import com.example.networking.model.post
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository):ViewModel() {
    val myResponse:MutableLiveData<post> = MutableLiveData()
    fun getpost(){
        viewModelScope.launch {
        val response: post = repository.getpost()
            myResponse.value = response
        }
    }
}