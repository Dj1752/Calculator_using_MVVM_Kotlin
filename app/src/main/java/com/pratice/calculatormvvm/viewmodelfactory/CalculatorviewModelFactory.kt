package com.pratice.calculatormvvm.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.pratice.calculatormvvm.viewmodel.CalculatorViewModel

class CalculatorviewModelFactory(val counter:Int) :ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CalculatorViewModel(counter) as T
    }

}