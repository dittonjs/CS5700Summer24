package org.example

class SubtractOperation: Operation {
    override fun performOperation(result: Result) {
        result.value -= 2
    }
}