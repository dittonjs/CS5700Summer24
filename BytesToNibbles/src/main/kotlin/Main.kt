package org.example

@OptIn(ExperimentalStdlibApi::class)
fun main() {
    val byte = (0xF6).toUByte()
    val firstNibble = byte.toInt() shr 4
    val secondNibble = byte.toInt() and 0xF
    println(firstNibble.toHexString())
    println(secondNibble.toHexString())

    var newByte = firstNibble shl 4
    newByte = newByte or secondNibble
}