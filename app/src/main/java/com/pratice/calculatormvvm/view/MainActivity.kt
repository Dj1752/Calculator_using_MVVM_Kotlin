package com.pratice.calculatormvvm.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.pratice.calculatormvvm.R
import com.pratice.calculatormvvm.databinding.ActivityMainBinding
import com.pratice.calculatormvvm.viewmodel.CalculatorViewModel
import com.pratice.calculatormvvm.viewmodelfactory.CalculatorviewModelFactory

class MainActivity : AppCompatActivity() {
     private lateinit var binding: ActivityMainBinding
     private lateinit var calculatorViewModel: CalculatorViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       calculatorViewModel = ViewModelProvider(this,CalculatorviewModelFactory(10)).get(CalculatorViewModel::class.java)
        binding.resultbtn.setOnClickListener{
            val num1 = binding.num1.text.toString().toIntOrNull()?:0
            val num2 = binding.num2.text.toString().toIntOrNull()?:0
            val res=  calculatorViewModel.CalculatorSum(num1,num2)
            binding.num3.text ="${res.sum}"
        }
    }
}