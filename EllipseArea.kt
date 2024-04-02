// EllipseArea.kt
// Date: Tue, 02-04-2024

/*
Write a Kotlin program to calculate the area of an ellipse.
Where, a = 7 and b = 5

Formula: Area of an ellipse = pi * a * b
*/

fun main(){

    val num1 = 7
    val num2 = 5

    // print values
    println("Value of the first axes: $num1")
    println("Value of the second axes: $num2")

    // calculate area of an ellipse
    val pi = 3.142
    val ellipseArea = pi * (num1 * num2)

    // print result
    println("Area of an ellipse:: $ellipseArea")
}
