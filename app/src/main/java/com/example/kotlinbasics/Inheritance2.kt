package com.example.kotlinbasics

fun main() {
  /*  val coffeeMachine = CoffeeMachine(100.00, "Brown")
    coffeeMachine.MakeCoffee()*/

    val coffeeMachine = PremiumCoffeeMachine(100.00, "Brown")
    coffeeMachine.MakeCoffee()
    coffeeMachine.makeCappuccino()
}


// This is super class. If you want to this superclass to another class then you should declare
// open keyword before the class name
open class CoffeeMachine(val price: Double, val color: String) {
    fun MakeCoffee() {
        println("Coffee is ready")
    }
}

// This is sub class of super class
class PremiumCoffeeMachine(val price_: Double, val color_: String) : CoffeeMachine(price_, color_) {

    fun makeCappuccino() {
        println("Cappuccino is ready")
    }
}
