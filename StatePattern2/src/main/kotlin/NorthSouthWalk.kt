package org.example

class NorthSouthWalk: State {
    override fun onTimerExpire(intersection: Intersection) {
        intersection.state = EastWestYellow()
    }
}