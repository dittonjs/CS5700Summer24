package shape

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.DrawContext

class Circle(x: Float, y: Float): Shape(x, y) {
    override fun draw(context: DrawContext, paint: Paint) {
        context.canvas.drawCircle(
            Offset(x, y),
            100F,
            paint
        )
    }
}