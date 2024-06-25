fun main() {
    // write your code here
    val str = readLine()!!
    val strLength = str.length
    print("$strLength repetitions of the word $str: ${str.repeat(strLength)}")
}