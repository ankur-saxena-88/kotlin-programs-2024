//FindAvgOfThree.kt
// Date: Fri, 22-03-2024

// Write a Kotlin program to find the sum and average of three numbers.
// Where, num1 = 13, num2 = 25 and num3 = 45

fun main(){

	val num1 = 13
	val num2 = 25
	val num3 = 45

	println("First number is: $num1")
	println("Second number is: $num2")
	println("Third number is: $num3")

	// calculate sum
	val sum = (num1 + num2 ) + num3

	// calculate average
	val avgOfThree = sum / 3.0

	// display the result
	println("The sum of $num1, $num2 and $num3 : $sum")
	println("Average : $avgOfThree")
}