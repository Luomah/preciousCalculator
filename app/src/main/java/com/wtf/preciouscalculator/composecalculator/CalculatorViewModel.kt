package com.wtf.preciouscalculator.composecalculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.wtf.preciouscalculator.calculatorworks.CalculatorAction
import com.wtf.preciouscalculator.calculatorworks.CalculatorOperation
import com.wtf.preciouscalculator.calculatorworks.CalculatorState

class CalculatorViewModel: ViewModel() {
    var state by mutableStateOf(CalculatorState())
        private set

    fun onAction(action: CalculatorAction){
        when(action){
            is CalculatorAction.Number -> enterNumber(action.number)
            is CalculatorAction.Decimal -> enterDecimal()
            is CalculatorAction.Clear -> state = CalculatorState()
            is CalculatorAction.Operation -> enterOperation(action.operation)
            is CalculatorAction.Calculate-> performCalculation()
            is CalculatorAction.Delete-> performDeletion()
        }
    }

    private fun performDeletion() {
        TODO("Not yet implemented")
    }

    private fun performCalculation() {
        TODO("Not yet implemented")
    }

    private fun enterOperation(operation: CalculatorOperation) {
        TODO("Not yet implemented")
    }

    private fun enterDecimal() {
        TODO("Not yet implemented")
    }

    private fun enterNumber(number: Int) {
        TODO("Not yet implemented")
    }
}