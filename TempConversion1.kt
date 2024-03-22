// TempConversion1.kt
// Date: Fri, 22-03-2024

// Write a Kotlin program that converts temperature from Fahrenheit to Celsius.

fun main(){

	val tempInFahrenheit = 85

	// print temperature in fahrenheit
	println("The temperature in Fahrenheit: $tempInFahrenheit")

	// convert fahrenheit to celsius
	val tempInCelsius = (tempInFahrenheit - 32) *5 / 9

	// display the result
	println("Temperature in Celsius: $tempInCelsius")
}