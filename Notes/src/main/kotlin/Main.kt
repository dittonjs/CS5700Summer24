import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

object IdGenerator {
    var ID = 1
    init {
        println("I got created!")
    }
}

@Composable
@Preview
fun App() {
    var noteFieldContent by remember { mutableStateOf("") }
    val notes = remember { mutableStateListOf<Note>()}

    MaterialTheme {
        Column{
            TextField(noteFieldContent, onValueChange = {
                noteFieldContent = it
            })

            Button(onClick = {
                notes.add(Note(
                    id=IdGenerator.ID++,
                    content=noteFieldContent
                ))
            }) {
                Text("Save")
            }
            LazyColumn {
                items(notes, key = {it.id}) {
                    Row(
                        modifier = Modifier
                            .padding(8.dp)
                            .border(1.dp, Color.Black, RoundedCornerShape(4.dp))
                            .padding(4.dp)
                    ){
                        Text(it.content)
                    }
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
