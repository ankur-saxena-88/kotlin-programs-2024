// DivDemo1.kt
// Date: Sun, 17-03-2024
/*
Kotlin demo program to find the division of two numbers 50 and 3 using type conversion method.
*/

fun main(){

    val num1 = 50
    val num2 = 3

    println("First number is: $num1")
    println("Second number is: $num2")

    // calculate division
    val divResult = num1.toDouble()/num2.toDouble() // type conversion

    // printing result
    println("The division of $num1 and $num2 is:: $divResult")
}