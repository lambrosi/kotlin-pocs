package com.lucasambrosi.operation

class PowOperation(n1: Int, n2: Int) : Operation(n1, n2) {
    override fun execute(): Int {
        return Math.pow(firstNumber.toDouble(), secondNumber.toDouble()).toInt()
    }
}