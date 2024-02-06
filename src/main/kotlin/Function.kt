fun main(args: Array<String>) {
    Salma()
    School()
    Add()

    var num =144
    println("Square root of $num is: ${Math.sqrt(num.toDouble())}")
}

fun Salma(){
    println("My name is Aden")
}
fun School(){
    println("My is Emobilis")
}
fun Add(){
    println("Enter num2")
    var num2 = readLine()?.toIntOrNull()
    println("Enter num4")
    var num4 = readLine()?.toIntOrNull()
    println("Sum is: ${num2!! +num4!!}")



}