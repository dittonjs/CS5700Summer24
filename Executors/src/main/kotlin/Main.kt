import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit


fun main() {
    val executor = Executors.newSingleThreadScheduledExecutor()

    val future = executor.scheduleAtFixedRate({
            Thread.sleep(1000)
            println("Hello!")
        },
        0,
        1500,
        TimeUnit.MILLISECONDS
    )

    future.get()
    println("I am called")
    executor.shutdown()
}
