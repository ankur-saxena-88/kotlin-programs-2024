// DemoAssignmentOpp.kt
// Date: Sun, 24-03-2024

/*
Kotlin - Assignment operator demo program
Where,
~ Value of the first variable is : 10
~ Value of the second variable is : 5
*/

fun main(){

    var num1 = 10
    var num2 = 5

    num1 += num2 // num1 = num1 + num2
    println("a+ = b: $num1")

    num1 -= num2 // num1 = num1 - num2
    println("a- = b: $num1")

    num1 *= num2 // num1 = num1 * num2
    println("a* = b: $num1")

    num1 /= num2 // num1 = num1 / num2
    println("a/ = b: $num1")

    num1 %= num2 // num1 = num1 % num2
    println("a% = b: $num1")
}