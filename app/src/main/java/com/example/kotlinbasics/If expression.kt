package com.example.kotlinbasics

fun main(args: Array<String>) {
    val a = 4
    val b = 5

    val check: Int = if (a > b) {
        println("A is grater than B")
        a
    }
    else {
        println("B is grater than A")
        b
    }

    println(check)
}