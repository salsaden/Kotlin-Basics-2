fun main(args: Array<String>) {
    val obj = Student2 ("Ajeet", 78)

    val obj1 = Student4("Salman")

    val stu2 =Student6("Harry", 22)
}


class Student2 {
    constructor(name: String, age: Int) {
        println("Student Name: ${name.toUpperCase()}")
        println("Student age: $age")
    }
}

class Student4 {
    constructor(name:String): this(name,0){
        println("\nsecondary constructors with one param")
    }
    constructor(name:String, age:Int){
        println("\nsecondary constructor with two param")
        println("Student name: ${name.toUpperCase()}")
        println("Student Age: $age")
    }
}


open class College6{
    constructor(name:String, age:Int){
        println("\nparent class constructor")
        println("Student Name: ${name.toUpperCase()}")
        println("Student Age: $age")
    }
}

class Student6: College6{
    constructor(name:String, age:Int): super(name,age){
        println("child class constructor")
        println("Student Name: $name")
        println("Student Age: $age")
    }

    }
