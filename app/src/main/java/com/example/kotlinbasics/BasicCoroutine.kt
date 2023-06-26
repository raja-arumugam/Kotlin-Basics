package com.example.kotlinbasics

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {        // Start the main thread here
    println("Starts Here: ${Thread.currentThread().name}")

    GlobalScope.launch {
        println("started : ${Thread.currentThread().name}")
        delay(1000)
        println("finished : ${Thread.currentThread().name}")
    }

    Thread.sleep(3000)
    println("Completed Here : ${Thread.currentThread().name}")

}




