class Example{
    private var number: Int =5

    fun calculateSquare():Int{
        return number*number
    }
}

fun main(args: Array<String>) {

    val obj = Example()
    println("${obj.calculateSquare()}")
}