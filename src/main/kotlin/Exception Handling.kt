fun main(args: Array<String>) {
    try{
        var num = 10/0
        println("BeginnersBook.com")
        println(num)
    }catch (e:ArithmeticException){
        println("Arithmetic Exception")
    }catch (e:Exception){
        println(e)
    }finally {
        println("It will print in any case")
    }

        var num1 = 20/0
        println("BeginnersBook.com")
        println(num1)

 //Throwing an exception in Kotlin
    try {
     println("Before Exception")
     throw Exception("Something went wrong here")
     println("After exception")
    }
     catch (e:Exception){
         println(e)
     }
    finally {
        println("You can't ignore")
    }

}