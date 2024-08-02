package org.example

import java.util.concurrent.Executors
import java.util.concurrent.ScheduledFuture
import java.util.concurrent.TimeUnit

fun main() {
    Intersection().start()
}

class Intersection {
    var state: State = NorthSouthGreen()

    var timerFuture: ScheduledFuture<*>? = null
    var buttonFuture: ScheduledFuture<*>? = null
    val executor = Executors.newSingleThreadScheduledExecutor()

    fun startTimer() {
        timerFuture = executor.scheduleAtFixedRate(
            {
                state.onTimerExpire(this)
                println(state)
            },
            3000,
            3000,
            TimeUnit.MILLISECONDS
        )
    }

    fun start() {
        startTimer()

        buttonFuture = executor.scheduleAtFixedRate(
            {
                state.onButtonPress(this)
                println(state)
                timerFuture?.cancel(true)
                startTimer()
            },
            14000,
            14000,
            TimeUnit.MILLISECONDS
        )
    }

}