package com.lucasambrosi.operation

class MultiplicationOperation(n1: Int, n2: Int) : Operation(n1, n2) {
    override fun execute(): Int {
        return firstNumber * secondNumber
    }
}