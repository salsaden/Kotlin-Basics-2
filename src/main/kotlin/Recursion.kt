fun main(args: Array<String>) {
    print("Enter a positive integer number: ")
    val number: Int=Integer.valueOf(readLine())
    val factorial = fact(number)
    println("Factorial of $number = $factorial")
}
 fun fact(num:Int): Int{
     return if(num== 1){
         num
     }
     else{
         num*fact(num-1)
     }
 }

/*
fun main(args: Array<String>) {
    val number = 6
    val factorial = fact(number)
    println("Factorial of $number = $factorial")
}

tailrec fun fact(n: Int, temp: Int = 1): Int {
    return if (n == 1){
        temp
    } else {
        fact(n-1, temp*n)
    }
}

*/