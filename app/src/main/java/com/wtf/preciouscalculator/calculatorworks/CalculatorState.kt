package com.wtf.preciouscalculator.calculatorworks

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
)
