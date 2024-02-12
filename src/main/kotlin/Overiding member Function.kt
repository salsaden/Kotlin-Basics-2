open class Animals(){
    open var colour:String = "White"
    open fun sound(){
        println("Animals make a sound")
    }
}
class Dogs:Animals(){
    override fun sound(){
        println("Dogs make a sound woof woof")
    }
}
class Cats:Animals(){
    override var colour: String = "Black"
    override fun sound(){
        println("Cats make a sound of meaw meaw")

    }
}

fun main(args: Array<String>) {
    val d =Cats()
    d.sound()
    println("${d.colour}")
}