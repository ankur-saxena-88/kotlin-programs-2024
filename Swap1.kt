// Swap1.kt
// Date: Mon, 18-03-2024

/*
Python Program to Swap Two Numbers using temporary variable.
Where, num1 = 10 and num2 = 50
*/

fun main(){

    var num1 = 10
    var num2 = 50

    // before swapping
    println("Before swapping....")
    println("First number is: $num1\nSecond number is: $num2")

    // perform swapping
    var num3 = num1 // num3 = 10
    num1 = num2 // num1 = 50
    num2 = num3 // num2 = 10

    // after swapping
    println("After swapping....")
    println("First number is: $num1\nSecond number is: $num2")
}