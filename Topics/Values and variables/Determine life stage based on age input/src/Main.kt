// Import Scanner class to read user input
import java.util.Scanner

fun main() {
    // Create a Scanner object to read user input
    val scanner = Scanner(System.`in`)
    // TODO: Read the user's age as an integer
    val age = scanner.nextInt()
    when {
        age < 18 -> println("You are a minor")
        age <= 64 -> println("You are an adult")
        else -> println("You are a senior")
    }

    // TODO: Check the age and print the appropriate message

}