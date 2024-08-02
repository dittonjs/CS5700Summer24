package org.example

class NorthSouthYellow: State {
    override fun onTimerExpire(intersection: Intersection) {
        intersection.state = EastWestGreen()
    }
}