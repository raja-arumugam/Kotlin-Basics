package com.example.kotlinbasics

sealed class Animals(val name: String) {
    class Dog: Animals("Charlie")
    class Cat: Animals("Aara")
}

class Tiger: Animals("Rock")

fun display(animals: Animals) {
    when (animals) {
        is Animals.Dog -> println("${animals.name} dog is a Pet animal")
        is Animals.Cat -> println("${animals.name} dog is a Pet animal")
        is Tiger -> println("${animals.name} dog is a Wild animal")
        else -> println("Invalid Data")
    }
}

fun main() {
    val dog = Animals.Dog()
    val cat = Animals.Cat()
    val tiger = Tiger()
    display(dog)
    display(cat)
    display(tiger)
}
