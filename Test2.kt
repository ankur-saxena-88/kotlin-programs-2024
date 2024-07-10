//Test2.kt
//Wed, 10-07-2024
//Kotlin code to clear the console screen.

// creating clearConsole function
fun clearConsole() {
    try {
        val os = System.getProperty("os.name")
        when {
            os.contains("Windows") -> {
                ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor()
            }
            os.contains("Linux") || os.contains("Mac") -> {
                Runtime.getRuntime().exec("clear")
            }
        }
    } catch (ex: Exception) {
        ex.printStackTrace()
    }
}    
//creating function
fun firstProgram(){

    println("Hi, Kotlin World!")
}

//creating main function
fun main(args: Array<String>){

    clearConsole()
    val name = "Alex"
    val age = 40

    //calling function
    firstProgram()

    println("The name of the user is : $name")
    println("Age of the user is : $age")
}
