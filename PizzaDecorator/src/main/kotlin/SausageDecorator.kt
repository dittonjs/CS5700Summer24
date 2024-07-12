package org.example

class SausageDecorator(pizza: Pizza): PizzaDecorator(pizza) {
    override fun order(): Double {
        return pizza.order() + 1.90
    }
}