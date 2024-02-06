fun main(args: Array<String>) {
//Try catch block
    try{
        var num = 100/0
        println(num)
    }
    catch (e: ArithmeticException){
        println("Arithmetic Error in the code")
    }
    println("Out of try catch block\n")
//Kotlin Try block with no catch blocks
    try {
        var num = 10/5
        println(num)
    }
    finally {
        println("Finally Block")
    }
    println("Out of try catch block")
}