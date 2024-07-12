package org.example

class PineappleDecorator(pizza: Pizza): PizzaDecorator(pizza) {
    override fun order(): Double {
        return pizza.order() + .85
    }
}