package com.example.kotlinbasics


fun main(args: Array<String>) {
    var cat = Mycat()
    println(cat.color)
    cat.eat()
    cat.meow()
}

open class MyAnimal {
    open var color: String = "White"

    open fun eat() {
        println("Animal Eating")
    }
}

class Mycat: MyAnimal() {
    var bread: String = ""

    override var color: String = "Black"

    fun meow() {
        println("Meow")
    }

    override fun eat() {
        super<MyAnimal>.eat()
        println("Cat is eating")
    }
}