package com.example.androdkotlincomponunt


import androidx.lifecycle.ViewModel

class MainViewModel(var countter: Int) : ViewModel() {
    var count: Int = countter
    fun increment(){

        count++

    }
}