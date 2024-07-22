//04_AddTwoNo.kt
//Sat, 13-07-2024

/*
Kotlin program to find addition of two numbers.
Where, First number = 20 and Second number = 30
*/

fun add(num1: Int, num2: Int): Int{
    
    println("First number is: $num1")
    println("Second number is: $num2")

    return num1 + num2
}

fun main(){

    var num1 = 20
    var num2 = 30

    var result = add(num1, num2)

    println("The addition of $num1 and $num2 is :: $result")
}
