package commands

import androidx.compose.ui.geometry.Offset

class NoopCommand: Command() {
    override fun execute(offset: Offset) {
        //noop
    }
    override fun undo() {
        //noop
    }
}