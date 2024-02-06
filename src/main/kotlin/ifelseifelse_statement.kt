fun main(args: Array<String>) {
    println("Enter your grade\n")
    var grade= readln().toInt()

    if (grade<=40){
        println("You have failed!!\n")
    }
    else if (grade>40 && grade<50){
        println("You have a D\n")
    }
    else if (grade>50 && grade<60){
        println("You have a C\n")
    }
    else if(grade>60 && grade<70){
        println("You have a B\n")
    }
    else if (grade>70){
        println("You have an A\n")
    }
    else{
        print("Error")
    }

}