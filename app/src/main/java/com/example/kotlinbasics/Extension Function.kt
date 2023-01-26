package com.example.kotlinbasics

class Android() {
    fun launch(year: Int) : Boolean {
        return year > 2007
    }
}

fun Android.JetpackRelease(year: Int): Boolean{   // This is new function which means Extension function
    return year > 2017
}

fun main() {
    val android = Android()
    println("The andorid released year :" + android.launch(2008))
    println("The jetpack released year :" + android.launch(2018))

}