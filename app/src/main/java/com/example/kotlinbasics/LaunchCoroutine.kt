package com.example.kotlinbasics

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Starts Here: ${Thread.currentThread().name}")

    val job: Job = launch {
        println("started : ${Thread.currentThread().name}")
        delay(1000)
        println("finished : ${Thread.currentThread().name}")
    }

    job.join()
    println("Completed Here : ${Thread.currentThread().name}")
}