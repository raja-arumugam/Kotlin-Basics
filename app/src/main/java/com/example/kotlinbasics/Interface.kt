package com.example.kotlinbasics

fun main() {
    var travel = Travel()
    travel.space()
    travel.sea()
}

interface Aeroplane {
    fun space() {
        println("To fly on te sky")
    }
}

interface Ship {
    fun sea() {
        println("To travel on the ocean")
    }
}

class Travel: Aeroplane, Ship {
    override fun space() {
        super.space()
    }

    override fun sea() {
        super.sea()
    }
}
