// FunDemo1.kt
// Date: Tue, 19-03-2024

/*
Kotlin basic demo program to find the addition of two numbers using function.
Where, num1 = 3 and num2 = 5
*/

// function definition
fun add(num1: Int, num2: Int): Int{

    return num1 + num2
}

// main function
fun main(){

    val sumResult = add(3, 5)
    println("Result of the addition: $sumResult")
}