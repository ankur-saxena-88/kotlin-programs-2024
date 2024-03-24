// CalcAreaRectangle.kt
// Date: Sun, 24-03-2024

/*
Write a Kotlin program to calculate the area of a rectangle.
Where,
length = 10.0
width = 5.0
*/

fun calculateArea(length: Double, width: Double): Double {
    return length * width
}

fun main() {
    // Define the dimensions of the rectangle
    val length = 10.0
    val width = 5.0
    
    // Calculate the area
    val area = calculateArea(length, width)
    
    // Print the result
    println("The area of the rectangle is: $area")
}