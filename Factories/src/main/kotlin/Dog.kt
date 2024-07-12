package org.example

abstract class Dog {

    companion object {
        var numInstances = 0
    }

    init {
        numInstances ++
    }
    enum class Nature {
        Smart,
        Active,
        Lazy
    }
    abstract fun speak()
}

class Poodle: Dog() {
    override fun speak() {
        println("Arf!")
    }
}

class BullDog: Dog() {
    override fun speak() {
        println("Woof!")
    }
}

class Husky: Dog() {
    override fun speak() {
        println("Woooooooooooooooooy!")
    }
}

class Schnauzer: Dog() {
    override fun speak() {
        println("Borg!")
    }
}

class Chihuahua: Dog() {
    override fun speak() {
        println("Yap!")
    }
}


class WienerDog: Dog() {
    override fun speak() {
        println("I am dog!")
    }
}
