//Passing a function to another function
//fun main(args: Array<String>) {
//    func("SalmaEmobilis", ::demo)
//}
//fun func(str:String, myfunc: (String) -> Unit){
//    print("Welcome to Kotlin tutorial at  ")
//    myfunc(str)
//}
//fun demo(str: String){
//    println(str)
//}

//Function returns another function

fun main(args: Array<String>) {

    val sum = func(10)
    println("10 + 20: ${sum(20)}")

}

fun func(num: Int): (Int) -> Int = {num2 -> num2 + num}

