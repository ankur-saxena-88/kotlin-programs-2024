// CombineStrings2.kt
// Date: Fri, 15-03-2024

// Using String Templates
/*
~ String Templates provide a more readable way to combine strings.
~ String templates are enclosed in dollar sign ($) and can include variable names or expressions within curly braces {}.
*/
fun main(){

    val name = "Ankur Saxena"
    val greeting = "Hi, ${name}!"

    // print greeting
    println("$greeting")
}

// Out: Hi, Ankur Saxena!
