package commands

import androidx.compose.ui.geometry.Offset

abstract class Command {
    abstract fun execute(offset: Offset)
    abstract fun undo()
//    abstract fun copy(): Command
}