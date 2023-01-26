package com.example.kotlinbasics

fun main(args: Array<String>) {

    var rect = Rectangle()
    rect.height = 5
    rect.width = 10

    println("The width of rectangle is : ${rect.width} and height of rectnalge is: ${rect.height}")
}

class Rectangle {
    var width: Int = 0
    var height: Int = 0
}