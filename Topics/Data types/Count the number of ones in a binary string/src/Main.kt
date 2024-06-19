import java.util.*

fun main(args: Array<String>) {
    // create a scanner object 'read' to read user input
    val read = Scanner(System.`in`)

    // capture the binary string as user input
    val binaryString = read.nextLine()
    val binaryArray = binaryString.toCharArray();
    var totalOne = 0;
    for (i in binaryArray) {
        if (i == '1') {
            totalOne++;
        }
    }
    println(totalOne)
    // Write your code here to count and print the number of ones (1s) in the binary string

}