package com.example.kotlinbasics

interface CEOSalary {
    fun salary(): Int
}

enum class Persons(val companyName: String, val location: String) : CEOSalary {

    SundarPichai("Google", "California") {
        // override from interface
        override fun salary(): Int = 100000
    },

    BillGates("MicroSoft", "Newyork") {
        // override from interface
        override fun salary(): Int = 200000000
    },

    SteveJobs("Apple", "Las vegas") {
        override fun salary(): Int = 400000000
    }
}

fun main() {
    /* Access properties and methods */
    println(Persons.SundarPichai.companyName)
    println(Persons.SundarPichai.salary())
    println(Persons.SundarPichai.location)

    println(Persons.BillGates.companyName)
    println(Persons.BillGates.salary())
    println(Persons.SundarPichai.location)

    println(Persons.SteveJobs.companyName)
    println(Persons.SteveJobs.salary())
    println(Persons.SundarPichai.location)

    /* Each enum object has two properties: ordinal and name */
    println(Persons.SteveJobs.ordinal)
    println(Persons.SteveJobs)

    /* Each enum object has two methods: values() and valueOf() */
    val myConstants: Array<Persons> = Persons.values()
    myConstants.forEach {
        println(it)
    }

    // When
    val ceoname : Persons = Persons.SteveJobs
    when(ceoname) {
        Persons.SundarPichai -> println("Sundar is Google CEO")
        Persons.BillGates -> println("Bill Gates is Google CEO")
        Persons.SteveJobs -> println("Steve Jobs is Google CEO")
        else -> "Invalid"
    }
}
