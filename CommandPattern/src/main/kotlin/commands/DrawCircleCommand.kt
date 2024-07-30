package commands

import Drawing
import shape.Circle

class DrawCircleCommand(drawing: Drawing): DrawShapeCommand(drawing) {

    override fun createShape(x: Float, y: Float) = Circle(x,y)
}