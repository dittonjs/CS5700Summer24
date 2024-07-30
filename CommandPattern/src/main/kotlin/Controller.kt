import androidx.compose.ui.geometry.Offset
import commands.Command
import commands.NoopCommand

class Controller {
    var command: Command = NoopCommand()
    private val undoStack = mutableListOf<Command>()

    fun invokeCommand(offset: Offset) {
        command.execute(offset)
        if(command !is NoopCommand) {
            undoStack.add(command)
        }
        command = NoopCommand()
    }

    fun undoLastCommand() {
        try {
            undoStack.removeLast().undo()
        } catch (_: NoSuchElementException) {}
    }
}