package com.example.androdkotlincomponunt

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this, MainViewModelFactory(6)).get(MainViewModel::class.java)
        settext()

    }



    private fun settext() {

        txtcounter.text = mainViewModel.count.toString()
    }

    fun increment(v : View) {
        mainViewModel.increment()
        settext()
    }
}