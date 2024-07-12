package org.example

class OliveDecorator(pizza: Pizza): PizzaDecorator(pizza) {
    override fun order(): Double {
        return pizza.order() + .40
    }
}