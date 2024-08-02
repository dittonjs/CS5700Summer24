package org.example

class EastWestYellow: State {
    override fun onTimerExpire(intersection: Intersection) {
        intersection.state = NorthSouthGreen()
    }
}