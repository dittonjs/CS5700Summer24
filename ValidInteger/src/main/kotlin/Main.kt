package org.example

fun main() {
    val verifier = IntegerVerifier()
    println(verifier.verify("12345"))
    println(verifier.verify("12349087612349876123498761234987612349876"))
    println(verifier.verify("012341234"))
    println(verifier.verify("0"))
    println(verifier.verify("123abc123"))

}