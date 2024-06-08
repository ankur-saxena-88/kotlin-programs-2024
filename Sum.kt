// Sum.kt
// Sun, 26-05-2024

/*
Kotlin program to find the sum of two numbers.
Where, num1 = 226 & num2 = 185
 */

fun findSum(){

    val num1 = 226
    val num2 = 185

    // print value
    println("First number is: $num1")
    println("Second number is: $num2")

    // calculate sum
    val sum = num1 + num2

    // print result
    println("The sum of $num1 and $num2 is :: $sum")
}

fun main(){

    // calling function inside println() function
    println("${findSum()}")
}