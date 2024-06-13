//AsciiValue.kt
//Mon, 10-06-2024

/*
Kotlin program to find ASCII value of a character.
where, character = a
*/

fun findAsciiValue(){
    val ch = 'a'
    val asciiValue = ch.toInt()

    println("The ASCII value of character $ch is :: $asciiValue")
}

fun main(){
    // calling function
    findAsciiValue()
}