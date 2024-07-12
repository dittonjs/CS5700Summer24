package org.example

class PepperoniDecorator(pizza: Pizza): PizzaDecorator(pizza) {
    override fun order(): Double {
        return pizza.order() + 1.10
    }
}