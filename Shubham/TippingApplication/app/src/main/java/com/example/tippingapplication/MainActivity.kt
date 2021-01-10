package com.example.tippingapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.tippingapplication.R.string.tip_amount
import com.example.tippingapplication.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateBt.setOnClickListener { calculateTip() }
    }

    private fun calculateTip() {
        Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT)
        val cost = binding.serviceCost.text.toString().toDoubleOrNull() ?: return;
        val tipPercent = when(binding.tipOptions.checkedRadioButtonId){
            R.id.amazing_rt -> 0.2
            R.id.good_rt -> 0.18
            else -> 0.15
        }
        var tipCost = cost*tipPercent;
        if (binding.roundupSwitch.isChecked){
            tipCost = kotlin.math.ceil(tipCost)
        }
        val formattedTip = NumberFormat.getCurrencyInstance().format(tipCost)
        binding.tipAmount.text = getString(R.string.tip_amount, formattedTip)
    }
}