import java.lang.NumberFormatException

fun main(args: Array<String>) {
    try{
//        var num = 10/0
//        println(num)
        var a = IntArray(5)
        a[10] = 99
    }
    catch (e : NumberFormatException){   //Handler Catch Block
        println("Number format exception")
    }
    catch (e: ArrayIndexOutOfBoundsException){
        println("Array index is out of range")
    }
    catch (e: Exception){    //Parent Exception Class
        println("Some Exception occurred")
    }
    println("Out of try catch block")
}