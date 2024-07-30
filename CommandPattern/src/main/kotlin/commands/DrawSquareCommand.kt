package commands

import Drawing
import shape.Square

class DrawSquareCommand(drawing: Drawing): DrawShapeCommand(drawing) {
    override fun createShape(x: Float, y: Float) = Square(x,y)
}