fun main(args: Array<String>) {
    val stu = Student("Salma", 34)

    println("Student name is : ${stu.name}")
    println("Student age: ${stu.age}\n")

    val shule = School("MKU", "Thika")
    val shule2 = School("UoN")
    val shule3 = School()

    println("School name: ${shule.name2} located in: ${shule.location} and the adress is:${shule.address}")
    println("School name: ${shule2.name2} located in: ${shule2.location} and the adress is:${shule2.address}\n")
  //println("School name: ${shule3.name2} located in: ${shule3.location} and the adress is:${shule3.address}")

    val stu1 = Student("Chaitanya", 31)
    val stu2 = Student("Chaitanya")
    val stu3 = Student()
}
 class Student(val name: String = "Student", var age: Int= 99){
     val stuName: String
     var stuAge: Int
     init {
         if (name == "Student"){
             stuName = "NA"
             stuAge = 0
         }
         else{
             stuName = name.toUpperCase()
             stuAge = age
         }
         println("Student Name is : $stuName")
         println("Student Age is: $stuAge")
     }

 }
class School(val name2: String = "eMobilis", var location:String="Westlands", var address:Int=234){

}