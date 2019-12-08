package com.lucasambrosi.operation

abstract class Operation(val firstNumber: Int,
                         val secondNumber: Int) {
    abstract fun execute(): Int
}