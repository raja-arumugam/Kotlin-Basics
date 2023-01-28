package com.example.kotlinbasics

fun main(args:Array<String>) {
    var animal = Animal()
    animal.color = "Black"
    animal.eat()

    var dog = Dog()
    dog.color = "Brown"
    dog.bread = "Golden"
    dog.bark()
    dog.eat()

    var cat = Cat()
    cat.color = "White"
    cat.age = 1
    cat.meow()
    cat.eat()
}


open class Animal() {      // Super class / Parent class /  Base class
    var color: String =""

    fun eat() {
        println("Eat")
    }
}

class Dog: Animal() {       // Sub class / Child class / Derived class
    var bread: String =""

    fun bark() {
        println("Bark")
    }
}

class Cat : Animal() {      // Sub class / Child class / Derived class

    var age: Int = -1

    fun meow() {
        println("Meow")
    }
}