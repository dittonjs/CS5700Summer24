package org.example

class DivideOperation: Operation {
    override fun performOperation(result: Result) {
            result.value /= 2
    }
}