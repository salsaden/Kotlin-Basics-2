class Outerclass{

    val oStr = "Outer CLass"

    class NestedClass{
        val nStr = "Nested Class"
        fun demo() = "demo() function of nested class"
    }
    inner class InnerClass{
        val inStr= "Inner Nested Class"
        fun demo() = "Demo() function using $oStr"
    }
}

fun main(args: Array<String>) {
    // accessing data member of nested class
    println(Outerclass.NestedClass().nStr)

    // accessing member function of nested class
    println(Outerclass.NestedClass().demo())

    //creating object of the Nested Class
    val obj = Outerclass.NestedClass()
    println(obj.demo())

    println(Outerclass().oStr)

    val o = Outerclass()
    println("${o.InnerClass().demo()}")

    val i = Outerclass().InnerClass()
    println("${i.demo()}")



}