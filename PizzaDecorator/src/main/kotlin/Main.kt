package org.example


fun log(callback: (Int, Int) -> Int): (Int, Int) -> Int {
    fun wrapper(x: Int, y: Int): Int {
        println("This was called with $x, and $y")
        return callback(x, y)
    }
    return ::wrapper
}

fun double(callback: (Int, Int) -> Int): (Int, Int) -> Int {
    fun wrapper(x: Int, y: Int): Int {
        return callback(x, y) * 2
    }
    return ::wrapper
}


fun doMath(x: Int, y: Int): Int {
    return x * y
}

fun main() {

    val myFunc = double(log(::doMath))
//    var pizza = Pizza()
//    pizza = PepperoniDecorator(pizza)
//    pizza = PepperoniDecorator(pizza)
//    pizza = PepperoniDecorator(pizza)
//    pizza = OliveDecorator(pizza)
//    pizza = PineappleDecorator(pizza)

    println(myFunc(10, 20))
}


