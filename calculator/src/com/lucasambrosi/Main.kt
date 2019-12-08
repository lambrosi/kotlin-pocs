package com.lucasambrosi

import com.lucasambrosi.operation.*

fun main() {

    val sum: Operation = SumOperation(5, 7)
    println(sum.execute()) //12

    val sub: Operation = SubtractionOperation(10, 7)
    println(sub.execute()) //3

    val mult: Operation = MultiplicationOperation(3, 5)
    println(mult.execute()) //15

    val div: Operation = DivisionOperation(21, 3)
    println(div.execute()) //7

    val pow: Operation = PowOperation(4, 2)
    println(pow.execute()) //16
}