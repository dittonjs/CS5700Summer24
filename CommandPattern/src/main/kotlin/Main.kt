import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.DrawContext
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.onPointerEvent
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import commands.DrawCircleCommand
import commands.DrawLineCommand
import commands.DrawSquareCommand

//class Circle(val x: Float, val y: Float, val radius: Float) {
//    fun draw(context: DrawContext, paint: Paint) {
//        context.canvas.drawCircle(
//            Offset(x, y),
//            radius,
//            paint = paint
//        )
//    }
//}

@Composable
@Preview
@OptIn(ExperimentalComposeUiApi::class)
fun App() {
    val drawing = remember { Drawing() }
    val controller = remember { Controller() }

    MaterialTheme {
        Column(modifier = Modifier.fillMaxSize()){
            Row {
                Button(onClick = {
                    controller.command = DrawCircleCommand(drawing)
                }) {
                    Text("Circle")
                }
                Button(onClick = {
                    controller.command = DrawSquareCommand(drawing)
                }) {
                    Text("Square")
                }
                Button(onClick = {
                    controller.command = DrawLineCommand(drawing)
                }) {
                    Text("Line")
                }
                Button(onClick = {
                    controller.undoLastCommand()
                }) {
                    Text("Undo")
                }
            }

            Canvas(modifier = Modifier
                .fillMaxSize()
                .border(1.dp, Color.Black, RoundedCornerShape(4.dp), )
                .onPointerEvent(PointerEventType.Press) {
                    controller.invokeCommand(offset = it.changes.first().position)
                }

            ) {
                drawing.shapes.forEach {
                    it.draw(drawContext, Paint())
                }
            }
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
