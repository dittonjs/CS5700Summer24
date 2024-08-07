package shape

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.DrawContext

class Line(x: Float, y: Float): Shape(x,y) {
    override fun draw(context: DrawContext, paint: Paint) {
        context.canvas.drawLine(
            Offset(x,y),
            Offset(x+100F, y),
            paint
        )
    }
}