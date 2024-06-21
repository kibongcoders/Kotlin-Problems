import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // Read the user's comment from input
    val comment = scanner.nextLine()

    // Check if the comment is a valid single-line comment
    val isValid = comment.startsWith("// ")

    // Print the result
    println(if (isValid) "Valid" else "Invalid")

}