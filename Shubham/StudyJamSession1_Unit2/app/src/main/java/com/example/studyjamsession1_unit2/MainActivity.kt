package com.example.studyjamsession1_unit2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.studyjamsession1_unit2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //var button1: Button = findViewById(R.id.button)
        //var button2: Button = findViewById(R.id.button2)

        var textview1 = binding.textView.text.toString()
    }
}