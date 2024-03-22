// TempConversion2.kt
// Date: Fri, 22-03-2024

// Write a Kotlin program that converts temperature from Celsius to Fahrenheit.
// Where, Temperature in Celsius = 33

fun main(){

	val tempCelsius = 33

	// print temperature in celsius
	println("Temperature in Celsius: $tempCelsius")

	// convert temperature from celsius to fahrenheit
	val tempFahrenheit = tempCelsius * (9.0 / 5.0) + 32

	// display the result
	println("Temperature in Fahrenheit: $tempFahrenheit")
}