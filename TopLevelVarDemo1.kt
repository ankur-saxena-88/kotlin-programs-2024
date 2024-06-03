// TopLevelVarDemo1.kt
// Mon, 03-06-2024

// declaring top-level variables
val name: String = "Alex"
var greeting: String = "Hello"

fun main(){

    println("${greeting}, ${name}!")

    // changing the value of greeting
    greeting = "Hi"

    println("${greeting}, ${name}!")
}