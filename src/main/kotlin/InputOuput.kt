import java.util.Scanner
fun main(args: Array<String>) {
    print("Enter your name:")
    val myeneteredname= readln()
    println("My name is ${myeneteredname}\n")

    print("Write any number: ")
    val number = Integer.valueOf(readln())
    println("The entered number is: $number\n\n")

    //creating Scanner object
    val read = Scanner(System.`in`)

    //Taking integer input
    println("Enter an integer number: ")
    var num1 = read.nextInt()

    //Taking float input
    println("Enter a float number: ")
    var num2 = read.nextFloat()

    //Displaying input numbers
    println("First Input Number: "+num1)
    println("Second Input Number: "+num2)
}

