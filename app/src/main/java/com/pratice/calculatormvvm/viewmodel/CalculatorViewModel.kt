package com.pratice.calculatormvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.pratice.calculatormvvm.model.CalculatorData

class CalculatorViewModel(val num3:Int): ViewModel() {
    fun CalculatorSum(num1:Int,num2:Int):CalculatorData{
        val res = num1+num2+num3
        return CalculatorData(num1,num2,res)
    }
}