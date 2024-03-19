// FunDoubleNum1.kt
// Date: Tue, 19-03-2024

/*
Write a Kotlin program to define a basic function to doubler a number.
Where, num = 5
*/

// function definition
fun doubleNum(num: Int): Int{

    return num * 2
}

// main function
fun main(){

    val num = 5

    // calling function
    val doubledNum = doubleNum(num)

    // printing result
    println("Double of $num is:: $doubledNum")
}