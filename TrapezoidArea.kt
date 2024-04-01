// TrapezoidArea.kt
// Date: Mon, 01-04-2024

/*
Write a Kotlin program to calculate the area of a trapezoid.
Where, base1 = 32, base2 = 12 and height = 5

Formula: Area = (base1 + base2) * height / 2
*/

fun main(){

    var base1 = 32
    var base2 = 12
    var height = 5

    // print the values
    println("Value of base1: $base1")
    println("Value of base2: $base2")
    println("Value of height: $height")

    // calculate area
    var area = ((base1 + base2) * height) / 2.0

    // print result
    println("Area of a trapezoid:: $area")
}