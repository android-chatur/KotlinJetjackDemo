package com.example.androdkotlincomponunt

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

open class MainViewModelFactory(var countter: Int ) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
      return MainViewModel(countter) as T
    }


}