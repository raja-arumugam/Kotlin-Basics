package com.example.kotlinbasics

fun main() {

    for(i in 0..20) {
        if (i == 3)
            continue
            println(i)
    }

    myLoop@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) {
                continue@myLoop
            }
            println("$i  $j")
        }
    }
}