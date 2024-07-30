import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import shape.Shape

class Drawing {
    // look into this
    val shapes = mutableStateListOf<Shape>()

    fun addShape(shape: Shape) {
        shapes.add(shape)
    }

    fun removeShape(shape: Shape) {
        shapes.remove(shape)
    }

}