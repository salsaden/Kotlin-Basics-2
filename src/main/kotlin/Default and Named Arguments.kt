fun main(args: Array<String>) {
    demo()
    demo2(99)
    demo3(98, 'W')
    demo4(ch='S')
}
fun demo(number:Int=100, ch: Char ='A'){
    println("Number is: $number and Character is: $ch")
}
fun demo2(number:Int=100, ch: Char='B'){
    println("Number is: $number and Character is: $ch")
}
fun demo3(number: Int=100, ch: Char='C'){
    println("Number is: $number and Chracter is: $ch")
}
fun demo4(number:Int=100, ch: Char='D'){
    println("Number is: $number and Charcter is: $ch")
}