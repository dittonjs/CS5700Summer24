package org.example

class FirstDigit: IntegerState {
    override fun consumeCharacter(char: String, integerVerifier: IntegerVerifier) {
        if (char in "123456789") {
            integerVerifier.state = Valid()
        } else {
            integerVerifier.state = Invalid()
        }
    }
}