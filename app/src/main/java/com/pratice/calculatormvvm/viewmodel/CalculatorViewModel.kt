package com.pratice.calculatormvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.pratice.calculatormvvm.model.CalculatorData

class CalculatorViewModel: ViewModel() {
    fun CalculatorSum(num1:Int,num2:Int):CalculatorData{
        val res = num1+num2
        return CalculatorData(num1,num2,res)
    }
}