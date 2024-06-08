// Multiply.kt
// Sat, 08-06-2024

/*
Kotlin program to multiply two numbers.
where, num1 = 12 & num2 = 15
 */

fun findMultiply(){
    val num1 = 12
    val num2 = 15

    println("First number is: $num1")
    println("Second number is: $num2")

    // calculate and print result
    println("Multiplication of $num1 and $num2 is :: ${(num1 * num2)}")
}

fun main(){
    // calling function
    println("${findMultiply()}")
}