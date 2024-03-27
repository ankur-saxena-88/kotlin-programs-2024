// CircleArea.kt
// Date: Wed, 27-03-2024

/*
Write a Kotlin program to calculate the area of a circle.
Where, Radius (r) = 12

Formula: Area = pi * radius * radius
*/

fun main(){

    val pi = 3.142
    val cirRadius = 12

    println("Value of the radius is: $cirRadius")

    // calculate circle area
    val area = pi * (cirRadius * cirRadius)

    // print result
    println("Area of a circle:: $area")
}