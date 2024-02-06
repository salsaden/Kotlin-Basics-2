fun main(args: Array<String>) {
//    val stu = Student("Salma", 34)
//
//    println("Student name is : ${stu.name}")
//    println("Student age: ${stu.age}")
//
//    val shule = School("MKU", "Thika")
//    val shule2 = School("UoN")
//    val shule3 = School()
//
//    println("School name: ${shule.name} and its location is: ${shule.location}")
//    println("School name: ${shule2.name} and its location is: ${shule2.location}")
////    println("School name: ${shule3.name} and its location is: ${shule3.location}")

    val stu = Student("Chaitanya", 31)
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
class School(val name: String = "eMobilis", var location:String="Westlands"){

}