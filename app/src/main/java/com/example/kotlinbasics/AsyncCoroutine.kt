package com.example.kotlinbasics

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Started Here: ${Thread.currentThread().name}")

    val deferred: Deferred<String> = async {
        println("started : ${Thread.currentThread().name}")
        delay(1000)
        println("finished : ${Thread.currentThread().name}")
        "Raja"
    }

    deferred.join()
    println("Completed: ${Thread.currentThread().name}")

}