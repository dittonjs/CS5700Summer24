package org.example
import org.example.Dog.Nature


fun main() {
    val pound = SmallBreedDogPound()
    println(pound.adoptDog(Nature.Smart))
    println(pound.adoptDog(Nature.Smart))
    println(pound.adoptDog(Nature.Smart))
    println(Dog.numInstances)
}


//fun talkToDog(dog: Dog) {
//    dog.speak()
//}

