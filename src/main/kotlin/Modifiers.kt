
open class Parent2(){
    var num =100

    private var str="Salsaden"

    protected open val ch = 'A'

    internal val number =99

    open protected fun demo() { }
}

class Child2:Parent2(){
    override val ch = 'Z'
    override fun demo(){
        println("demo function of child class")
    }
}

fun main(args: Array<String>) {

    val obj = Parent2()

    val obj2 =Child2()
}

