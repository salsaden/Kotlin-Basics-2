abstract class Students(name:String, age:Int){
    init{
        println("Student name is:$name")
        println("Student age is: $age")
    }

    fun demo() {
        println("Non-abstract function of abstract class")
    }

    abstract fun func(message:String)
}

class College(name:String, age:Int):Students(name,age){
    override fun func(message: String) {
        println(message)
    }

}

fun main(args: Array<String>) {
    val obj = College("Salsaden", 34)
    obj.func("I'm a blogger")
    obj.demo()

}