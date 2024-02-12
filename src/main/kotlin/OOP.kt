class calculate{

    var num: Int = 6

    fun calculateSquare():Int{
        return num*num
    }
    fun sum():Int{
        return ( num+num)
    }
}

fun main(args: Array<String>) {
    val obj = calculate()
    println("${obj.calculateSquare()}")
    val obj2=calculate()
    println("${obj2.sum()}")

}