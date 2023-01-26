package com.example.kotlinbasics

fun main() {

    var string1: String? = null
    var string2: String? = "raja"

    var length1: Int = if(string1 != null) string1.length else -1
    var length2: Int = if(string2 != null) string2.length else -1

    println(length1)
    println(length2)

}