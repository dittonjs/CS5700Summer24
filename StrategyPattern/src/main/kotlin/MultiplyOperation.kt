package org.example

class MultiplyOperation: Operation {
    override fun performOperation(result: Result) {
        result.value *= 2
    }
}