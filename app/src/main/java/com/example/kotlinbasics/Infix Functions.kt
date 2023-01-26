package com.example.kotlinbasics

fun main(args: Array<String>) {

    val x: Int = 6
    val y: Int = 10

    val greaterVal = x findGreaterValue y   // x.findGreaterValue(y)

    println(greaterVal)
}

infix fun Int.findGreaterValue(value:Int): Int{
    if (this > value)
        return this
    else
        return value
}

/*
*       1. All INFIX Functions are Extension functions
*            But all Extension functions are not INFIX
*       2. INFIX Functions just have ONE PARAMETER
* */