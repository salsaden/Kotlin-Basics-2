interface MyInterface{
    var str: String

    fun demo()

    fun func(){
        println("Hello")
    }
}

class Myclass: MyInterface{
    override  var str:String = "eMobilis\n"
    override fun demo(){
        println("demo funtion")
    }
}


fun main(args: Array<String>) {
    val obj = Myclass()
    obj.demo()
    obj.func()
    println(obj.str)

    //Implementing more than one interface
    val objXY = MyclassXY()
    objXY.demoX()
    objXY.demoY()
    objXY.funcX()
    objXY.funcY()
}


//Implementing more than one interface

interface X {
    fun demoX(){
        println("demoX function")
    }
    fun funcX()
}

interface Y {
    fun demoY(){
        println("demoY function")
    }
    fun funcY()
}

//The class that implements both X and Y
class MyclassXY: X,Y{
    override fun funcX(){
        println("Hello this is X")
    }
    override fun funcY(){
        println("Hello this is Y")
    }
}

//When multiple interfaces have same method name, ** We overide it using super key**
/*

interface X {

    fun demo() {
        println("demoX function")
    }
}

interface Y  {
    fun demo() {
        println("demoY function")
    }
}

// This class implements X and Y interfaces
class MyClass: X, Y{
     override fun demo(){
     super<Y>.demo()

fun main(args: Array<String>) {
    val obj = MyClass()
    obj.demo()
}
 */