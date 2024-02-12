data class Mwanafunzi(val name: String, val age: Int)

data class Arday(val name:String, val age:Int, val sub:String)

fun main(args: Array<String>) {
    val stu = Mwanafunzi("Zamzam", 32)
    val stu2 = Mwanafunzi("Farah", 19)
    val stu3 = Mwanafunzi("Asma", 22)

    //Equals()
    if (stu.equals(stu2) == true)
        println("stu is equal to stu2.")
    else
        println("stu is not equal to stu2.")

    if(stu.equals(stu3) == true)
        println("stu is equal to stu3.")
    else
        println("stu is not equal to stu3.")

//HashCode()
    println("Hashcode of stu: ${stu.hashCode()}")
    println("Hashcode of stu: ${stu2.hashCode()}")
    println("Hashcode of stu: ${stu3.hashCode()}")

    val qof = Arday("Khadija", 32, "Science")

    //coping age and subject from object qof
    val qof2 = qof.copy(name = "Riana")

    println("qof: Name ${qof.name}, Age ${qof.age} & Subject ${qof.sub}")
    println("qof2: Name ${qof2.name}, Age ${qof2.age} & Subject ${qof2.sub}\n")

    //toString() method
    println(qof.toString())

    //componentN() method **destructures an object into a number of variables**
    val name = qof.component1()
    val age = qof.component2()
    val sub = qof.component3()
    println("\nName is: $name")
    println("Age is: $age")
    println("Subject is: $sub")

}