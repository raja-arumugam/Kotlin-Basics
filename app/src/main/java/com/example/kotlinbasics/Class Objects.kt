package com.example.kotlinbasics

fun main() {

    var car = Car()
    car.brand = "Jaguar"
    car.color = "Black"
    car.model = "Xjl"

    println(car.brand)
    println(car.color)
    println(car.model)

}

class Car {
    var color = ""
    var brand = ""
    var model = ""
}