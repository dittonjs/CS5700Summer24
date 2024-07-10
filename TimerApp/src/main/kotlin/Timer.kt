import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay


// Textbook observer pattern
//class Timer(startTime: Int): TimerSubject {
//    var timeRemaining = startTime
//        private set(value) {
//            field = value
//            notifyObservers()
//        }
//
//    private val subscribers = mutableListOf<TimerObserver>()
//
//    override fun subscribe(observer: TimerObserver) {
//        subscribers.add(observer)
//    }
//
//    override fun unsubscribe(observer: TimerObserver) {
//        subscribers.remove(observer)
//    }
//
//    override fun notifyObservers() {
//        subscribers.forEach {
//            it.notify(timeRemaining)
//        }
//    }
//
//    suspend fun start() {
//        coroutineScope {
//            while(timeRemaining > 0) {
//                delay(1000)
//                timeRemaining --
//            }
//        }
//    }
//}

class Timer(startTime: Int) {
    var timeRemaining = startTime
        private set(value) {
            field = value
            notifyObservers()
        }

    private val subscribers = mutableListOf<(Int) -> Unit>()

    fun subscribe(observer: (Int) -> Unit) {
        subscribers.add(observer)
    }

    fun unsubscribe(observer: (Int) -> Unit) {
        subscribers.remove(observer)
    }

    fun notifyObservers() {
        subscribers.forEach {
            it(timeRemaining)
        }
    }

    suspend fun start() {
        while(timeRemaining > 0) {
            delay(1000)
            timeRemaining --
            println(timeRemaining)
        }
    }
}