package com.example.kotlinbasics

fun main(args: Array<String>) {

    for (i in 0 until 10) {
        if (i % 2 == 0) {     // it prints odd number only which is not divided by 2
            println(i)
        }
    }

    for(i in 10 downTo 5) {
        println(i)
    }
}