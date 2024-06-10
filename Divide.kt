//Divide.kt
//Mon, 10-06-2024

/*
Kotlin program to divide two numbers.
where, num1 = 25 and num2 = 4
*/
fun findDivide(){

    val num1 = 25
    val num2 = 4

    println("First number is: $num1")
    println("Second number is: $num2")

    // calculate division
    val result = (num1.toDouble()) / (num2.toDouble()) // type casting

    // printing result
    println("Division of $num1 and $num2 is :: $result")
}

fun main(){
    // calling function
    findDivide()
}