package org.example

import kotlinx.coroutines.*


class Looper {
    suspend fun loopForever() {
        while(true) {
            println("I am looping!1")
            delay(1000)
        }

    }
}



fun main() {
    runBlocking {

        val prossess1 = async {
            var i = 10;
            while(i > 0) {
                i--
                println(i)
                delay(1000)
            }
        }
        val prossess2 = async {
            var i = 12;
            while(i > 0) {
                i--
                println(i)
                delay(1000)
            }
        }
        val job = launch {
            while(true) {
                delay(1000)
                println("Running forever")
            }
        }

        job.invokeOnCompletion {
            println("I am finished")
        }

        awaitAll(prossess1, prossess2)
        job.cancelAndJoin()
        println("All done!")

    }
    println("Program terminating")
}