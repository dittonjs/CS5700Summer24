package commands

import Drawing
import shape.Line

class DrawLineCommand(drawing: Drawing): DrawShapeCommand(drawing) {
    override fun createShape(x: Float, y: Float) = Line(x,y)
}