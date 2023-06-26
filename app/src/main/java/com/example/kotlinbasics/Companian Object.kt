package com.example.kotlinbasics

fun main(args: Array<String>) {

    Users.count           // You can print it and check result
    Users.typeOfCustomers()
}

class Users {
    companion object {

        var count: Int = -1             // Behaves like STATIC variable

        @JvmStatic
        fun typeOfCustomers(): String { // Behaves like STATIC method
            return "High budget"
        }
    }
}