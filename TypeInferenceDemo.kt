// TypeInferenceDemo.kt
// Date: Tue, 19-03-2024

// This is the demo program of Type Inference in Kotlin.

fun main(){

    // type inference
    val name = "John" // compiler infers 'name' as String
    val age = 25 // compiler infers 'age' as Int

    // printing variable values
    println("Name: $name")
    println("Age: $age")

    // find the typeof variables
    println("Type of 'name' variable: ${name::class.simpleName}")
    println("Type of 'age' variable: ${age::class.simpleName}")
}
