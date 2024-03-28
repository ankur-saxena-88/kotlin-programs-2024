// AreaOfTriangle.kt
// Date: Thu, 28-03-2024

/*
Write a Kotlin program to calculate the area of a triangle.
Where, base = 12 and height = 15

Formula: Area of a triangle = (base * height) / 2
*/

fun main(){

    val base = 7
    val height = 5

    println("Value of the base: $base")
    println("Value of the height: $height")

    // calculate the area of a triangle
    val triangleArea = (base.toDouble() * height.toDouble()) / 2.0

    // print result
    println("The area of a triangle:: $triangleArea")
}