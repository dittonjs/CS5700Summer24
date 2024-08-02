package org.example

class EastWestWalk: State {
    override fun onTimerExpire(intersection: Intersection) {
        intersection.state = NorthSouthYellow()
    }
}