package com.example.kotlinbasics

fun main() {
    var travel = Travel()
    travel.sea()
    travel.space()
}

interface Rocket {
    fun space() {
        println("To travel on the space")
    }
}

interface Boat {
    fun sea() {
        println("To travel on the ocean")
    }
}

class Travels: Rocket,Boat {
    override fun space() {
        super.space()
    }

    override fun sea() {
        super.sea()
    }
}