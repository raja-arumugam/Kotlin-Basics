package com.example.kotlinbasics

fun main(args: Array<String>) {
    var x = 10

    do {
        if (x % 2 == 0) {
            println(x)
        }
        x++
    }
    while (x <= 20)
    println()
}