import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

@Composable
@Preview
fun App() {
    val viewHelper = remember { ViewHelper(60) }
    val coroutineScope = rememberCoroutineScope()
    MaterialTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("${viewHelper.timeRemaining}",
                fontSize = 48.sp
            )
            Button(onClick = {
                println("Hello?")
                coroutineScope.launch {
                    println("asdf")
                    viewHelper.startTimer()
                }
            }) {
                Text("Start Timer")
            }

        }
    }
}

@Composable
fun HelloMessage(name: String) {
    Text("Welcome to the app $name")
}

fun main() = application {
        Window(onCloseRequest = ::exitApplication) {
            App()
        }
    }


