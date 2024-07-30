package shape

import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.DrawContext

class Square(x: Float, y: Float): Shape(x,y) {
    override fun draw(context: DrawContext, paint: Paint) {
        context.canvas.drawRect(
            x,
            y,
            x+100f,
            y+100f,
            paint
        )
    }
}