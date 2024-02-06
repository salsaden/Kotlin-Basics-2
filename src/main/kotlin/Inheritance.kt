open class Animal(colour:String, age:Int){
    init {
        println("Color is: $colour")
        println("Age is: $age")
    }
}

class Dog(colour: String, age: Int): Animal(colour, age){
    fun woof(){
        println("Dog makes sound of woof")
    }
}

class Cat(colour: String, age: Int): Animal(colour, age){
    fun meow(){
        println("Cat makes sound of meow")
    }
}

class Horse(colour: String, age: Int): Animal(colour, age){
    fun neigh(){
        println("Horse makes sound of neigh")
    }
}

fun main(args: Array<String>) {
    val d = Dog("Black", 3)
    d.woof()
    val c = Cat("Grey", 2)
    c.meow()
    val h = Horse("Brown", 6)
    h.neigh()

}