//InputTest.kt
//Mon, 29-07-2024

//Kotlin demo program-take input from user.

fun testIn(){

    println("Please enter your name: ")
    val inputA = readLine()
    val textA = inputA!!.toString()

    println("Please enter your age: ")
    val inputB = readLine()
    val textB = inputB!!.toInt()

    println("Hi, ${textA}! Good Morning! Welcome to Kotlin!")
    println("Your age is ${textB} years.")
}

fun main(){

    //call function
    testIn()
}