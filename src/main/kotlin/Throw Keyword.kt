fun main(args: Array<String>) {
print("Enter your name: ")
    val name = readln()

    try {
        if (name == "Salsaden") {
            throw Exception("You don't have access")
        } else {
            println("Welcome! You have access")
        }
    }
    catch (e: Exception){
        println(e.message)
    }
}