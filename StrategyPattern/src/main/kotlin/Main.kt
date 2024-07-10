package org.example

fun main() {
    App()
}

class App {
    private val result = Result()
    private val operations = mapOf(
        Pair("add", AdditionOperation()),
        Pair("sub", SubtractOperation()),
        Pair("div", DivideOperation()),
        Pair("mult", MultiplyOperation()),
    )


    init {
        start()
    }

    private fun start() {
        println("Welcome!!")
        while(true) {
            println("Result is ${result.value}")
            println("Type either add, sub, mult, div, or exit")
            val input = readln()

            if(input == "exit") {
                break
            }

            operations[input]?.performOperation(result)
                ?: println("Invalid Operation")
        }
        println("Goodbye")
    }
}

class Result {
    var value = 0

    operator fun plusAssign(value: Int) {
        this.value += value
    }
}
