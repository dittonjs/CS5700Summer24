package commands

import Drawing
import androidx.compose.ui.geometry.Offset
import shape.Shape

abstract class DrawShapeCommand(val drawing: Drawing): Command() {
    private lateinit var shape: Shape

    override fun execute(offset: Offset) {
        shape = createShape(offset.x, offset.y)
        drawing.addShape(shape)
    }

    override fun undo() {
        drawing.removeShape(shape)
    }

    abstract fun createShape(x: Float, y: Float): Shape
}