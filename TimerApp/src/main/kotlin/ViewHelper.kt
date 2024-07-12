import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class ViewHelper() {
    var timeRemaining by mutableStateOf(60)
    var textFieldValue by mutableStateOf("60")

    suspend fun startTimer (startTime: Int) {
        timeRemaining = startTime
        val timer = Timer(startTime)
        timer.subscribe {
            timeRemaining = it
        }
        timer.start()
    }
}