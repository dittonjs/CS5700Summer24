package org.example

fun main() {
    val nums = createArray(100000, 2)

    for(num in nums) {
        println(num)
    }



//    val sequence = sequence {
//        yield(1)
//        yield(10)
//        yield(25)
//    }
//
//
//
//    for (value in sequence) {
//        println(value)
//    }

    val idGenerator = createIdGenerator()
    val person1 = Person(idGenerator.next(), "Joseph")
    val person2 = Person(idGenerator.next(), "Catelyn")
}

data class Person(val id: Int, val name: String)

fun createArray(num: Int, increment: Int): Sequence<Int> {
    return sequence {
        for (i in 0 until num) {
            yield(i*2)
        }
    }
}

fun createIdGenerator() = sequence {
    var currentId = 100000
    while(true) {
        yield(currentId++)
    }
}.iterator()


