package org.example
import org.example.Dog.Nature

class LargeBreedDogPound: DogPound() {
    override fun createDog(nature: Nature) = when(nature) {
        Nature.Smart -> Poodle()
        Nature.Lazy -> BullDog()
        Nature.Active -> Husky()
    }
}