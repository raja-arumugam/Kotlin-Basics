package com.example.kotlinbasics

fun main(args: Array<String>) {
    var student = Person("Steve jobs", 100)
    println(student.age)
}

class Person(var name: String) {
    var age: Int = 0

    init {
        println("Person has got a name as $name and id is $age")
    }

    constructor(n: String, age: Int): this(n) {
        this.age = age   // The body of the secondary constructor is called after init block
    }
}