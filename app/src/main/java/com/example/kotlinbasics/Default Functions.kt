package com.example.kotlinbasics

fun main(args: Array<String>) {
    var sum = calculate(3,5)
    println(sum)
}

fun calculate(widht: Int,breadth:Int,height: Int=10): Int {   // here we can add extra parameter
    return widht + breadth + height
}