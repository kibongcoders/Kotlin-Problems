fun main() {
    // put your code here
    val json = """
    {
        "firstName": "John",
        "lastName": "Smith",
        "age": 35,
        "phoneNumbers": [
            {
                "type": "mobile",
                "number": "123 567-7890"
            }
        ]
    }
    """.trimIndent()
    println(json)

}