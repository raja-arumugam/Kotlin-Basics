package com.example.kotlinbasics

fun main(args: Array<String>) {

    var sum = Calculate(lenght = 2,breadth = 4)
    println(sum)
}

// Here we can pass the async names parameters and we can add extra parameter
fun Calculate(breadth: Int, lenght:Int, height: Int = 10): Int {
    return breadth+lenght+height
}

