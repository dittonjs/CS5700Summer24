package org.example
import org.example.Dog.Nature

class SmallBreedDogPound: DogPound() {
    override fun createDog(nature: Nature) = when(nature) {
        Nature.Smart -> Schnauzer()
        Nature.Lazy -> WienerDog()
        Nature.Active -> Chihuahua()
    }
}