// RhombusArea.kt
// Date: Mon, 01-04-2024

/*
Write a Kotlin program to calculate the area of a rhombus.
Where, d1 = 256 and d2 = 8

Formula: Area of a rhombus = (d1 * d2) / 2
*/

fun main(){

    val diagonal1 = 256
    val diagonal2 = 8

    // print values
    println("Value of diagonal1: $diagonal1")
    println("Value of diagonal2: $diagonal2")

    // calculate rhombus area
    val area = (diagonal1 * diagonal2) / 2

    // print result
    println("Area of a rhombus:: $area")
}
