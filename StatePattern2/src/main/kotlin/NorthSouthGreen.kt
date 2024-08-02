package org.example

class NorthSouthGreen: State {
    override fun onTimerExpire(intersection: Intersection) {
        intersection.state = NorthSouthYellow()
    }

    override fun onButtonPress(intersection: Intersection) {
        intersection.state = EastWestWalk()
    }
}