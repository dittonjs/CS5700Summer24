package org.example

interface State {
    fun onTimerExpire(intersection: Intersection)

    fun onButtonPress(intersection: Intersection) {

    }
}