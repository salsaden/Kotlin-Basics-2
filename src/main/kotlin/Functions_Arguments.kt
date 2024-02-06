fun main(args: Array<String>) {
  name("Salma", 54, "female")
    name("Adey", 32, "female")
    name("Michael", 61, "male")
    school("Emobilis", "Westlands")

    println("Sum: ${sum(10, 20, 30, 40)}")

    val sum2 = {num1: Int, num2: Int -> num1 + num2}
    println("6+4 = ${sum(6,4)}")

}
fun sum(vararg numbers: Int): Int{
    var sum = 0
    numbers.forEach { num -> sum += num }
    return  sum
}
fun name(jina:String, miaka:Int, jinsia:String){
    println("My name is $jina, I am $miaka old and I am $jinsia")
}
fun school(title:String, location:String,){
    println("The school's name is $title and it is located in $location")
}
