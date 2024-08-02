package org.example

interface IntegerState {
    fun consumeCharacter(char: String, integerVerifier: IntegerVerifier)
}