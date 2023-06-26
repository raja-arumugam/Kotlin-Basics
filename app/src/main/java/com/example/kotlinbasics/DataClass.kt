package com.example.kotlinbasics

fun main(args: Array<String>) {
    val gadget1 = Gadget("Mobile","Apple",80000)
    val gadget2 = Gadget("Mobile","Android",70000)

    // To prints the all data from the data class
    println(gadget2.toString())

    // To prints hash code of the data class
    println(gadget1.hashCode())

    // Here we can chagne the value of name  by COPY()
    var brand = gadget1.copy(name = "Laptop")
    println(brand)

    // To equals the data
    if (gadget1 == gadget2) {
        println("It is equal")
    }
    else {
        println("It is not equal")
    }

}

data class Gadget(val name: String, val brand:String, val amount: Int)