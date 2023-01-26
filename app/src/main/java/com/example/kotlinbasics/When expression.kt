package com.example.kotlinbasics

fun main(args: Array<String>) {
    var a = 10

    var check: String = when (a) {
        1 -> "a is 1"
        2 -> "a is 2"
        else -> {
            "a is unknown"
        }
    }
    println(check)
}