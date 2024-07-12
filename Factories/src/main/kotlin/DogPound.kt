package org.example
import org.example.Dog.Nature


abstract class DogPound {

    fun adoptDog(nature: Nature): Dog {
        val dog = createDog(nature)
//        val dog = when(nature) {
//            Nature.Smart -> Schnauzer()
//            Nature.Lazy -> WienerDog()
//            Nature.Active -> Chihuahua()
//        }
        vaccinate(dog)

        alter(dog)
        acceptPayment()
        return dog;
    }

    private fun vaccinate(dog: Dog) {
        println("DOG $dog was vaccinated")
    }

    private fun alter(dog: Dog) {
        println("DOG $dog is having a bad day!")
    }

    private fun acceptPayment() {
        println("Payment accepted!")
    }

    protected abstract fun createDog(nature: Nature): Dog
}