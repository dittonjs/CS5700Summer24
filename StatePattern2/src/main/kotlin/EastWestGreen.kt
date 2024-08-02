package org.example

class EastWestGreen: State {
    override fun onTimerExpire(intersection: Intersection) {
        intersection.state = EastWestYellow()
    }

    override fun onButtonPress(intersection: Intersection) {
        intersection.state = NorthSouthWalk()
    }
}