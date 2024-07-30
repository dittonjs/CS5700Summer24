package shape

import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.DrawContext

abstract class Shape(val x: Float, val y: Float){

    abstract fun draw(context: DrawContext, paint: Paint)
}