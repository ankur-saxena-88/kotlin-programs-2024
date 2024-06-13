// PrintIntByUser.kt
// Sat, 08-06-2024

/*
Kotlin program to print an integer entered by the user.
 */

fun userPrintInteger(){
    println("Please enter a integer: ")

    val num = readLine()

    println("You entered: $num")
}

fun main(){
    // calling function
    userPrintInteger()
}