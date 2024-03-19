// Swap3.kt
// Date: Tue, 19-03-2024

/*
Write a Kotlin program to swap two numbers using * and / operators.
Where, num1 = 10 and num2 = 20
*/

fun main(){

    var num1 = 10
    var num2 = 20

    println("Before swapping....")
    println("First number is: $num1")
    println("Second number is: $num2")

    // perform swapping
    num1 = num1 * num2 // num1 = 10 * 20 = 200
    num2 = num1 / num2 // num2 = 200 / 20 = 10
    num1 = num1 / num2 // num1 = 200 / 10 = 20

    println("After swapping....")
    println("First number is: $num1")
    println("Second number is: $num2")
}