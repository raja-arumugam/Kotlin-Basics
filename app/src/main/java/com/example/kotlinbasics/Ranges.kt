package com.example.kotlinbasics

fun main(args: Array<String>) {
    val r1 = 1..5            // This range contains number 1, 2, 3, 4, 5

    val r2 = 5 downTo  1     // This range contains number 5, 4, 3, 2, 1

    val r3 = 'a'..'z'       // This range contains the values from "a", "b", "c" . . . "z"

    val r4 = 5 downTo 1 step 2   // This range contains number 5, 3, 1

    val moveUp = 1.rangeTo(10)     // This range contains number 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

    println(r1)
    println(r2)
    println(r3)
    println(r4)
    println(moveUp)
}