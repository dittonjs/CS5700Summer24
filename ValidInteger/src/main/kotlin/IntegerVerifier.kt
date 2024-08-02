package org.example

class IntegerVerifier {
    lateinit var state: IntegerState

    fun verify(string: String): Boolean {
        state = FirstDigit()
        string.chunked(1).forEach {
            state.consumeCharacter(it, this)
        }
        return state is Valid
    }
}