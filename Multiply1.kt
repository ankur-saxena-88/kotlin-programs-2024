// Multiply1.kt
// Mon, 10-06-2024

/*
Kotlin program to multiply two floating-point numbers.
where, num1 = 1.5 and num2 = 2.0
*/

fun findMultiply(){

    val num1 = 1.5f;
    val num2 = 2.0f;

    // printing variable values
    println("First number is: $num1");
    println("Second number is: $num2");

    // calculate multiply
    val result = num1 * num2;

    // printing result
    println("Multiplication of $num1 and $num2 is :: $result");
}

fun main(){

    // calling function
    findMultiply();
}