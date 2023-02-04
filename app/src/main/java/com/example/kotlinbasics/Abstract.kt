package com.example.kotlinbasics

fun main(args: Array<String>) {
//    var man = Man()         // Not allowed. You cannot create instance of abstract class
    var user = User()       // Allowed. Abstract Super class reference variable
    // pointing to child class object.
    user.name = "Raja"
    println(user.name)
    user.education()
}

abstract class Man {
    abstract var name: String
    abstract fun education()
}

class User : Man() {
    override var name: String = ""

    override fun education() {
        println("Master Degree")
    }
}