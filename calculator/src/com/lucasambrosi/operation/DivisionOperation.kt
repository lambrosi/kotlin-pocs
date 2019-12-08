package com.lucasambrosi.operation

class DivisionOperation(n1: Int, n2: Int) : Operation(n1, n2) {
    override fun execute(): Int {
        if (secondNumber == 0) throw RuntimeException("Division by zero is undefined.")
        return firstNumber / secondNumber
    }
}