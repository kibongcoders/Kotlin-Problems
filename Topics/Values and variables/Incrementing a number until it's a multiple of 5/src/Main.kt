// Kotlin version: 1.4.0 

// 1. Required imports
import java.util.*

fun main(args: Array<String>) {

    // Create a scanner object for reading inputs
    val reader = Scanner(System.`in`)

    // 2. Read the user's input. Make sure to declare it as a mutable variable
    // val variable = readLine()!!.toInt()
    var variable = reader.nextInt()
    while (variable % 5 != 0) {
        variable++
    }
    println(variable)
    // 3. Write a loop that keeps incrementing the variable until it is a multiple of 5

    // 4. Print the final variable value
}