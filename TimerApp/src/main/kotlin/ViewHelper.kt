import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class ViewHelper(startTime: Int) {
    var timeRemaining by mutableStateOf(startTime)
    private val timer = Timer(startTime)

    init {
        timer.subscribe {
            timeRemaining = timeRemaining
        }
    }

    suspend fun startTimer () {
        println("asdfasdf")
        timer.start()
    }
}