fun main(args: Array<String>) {
    println("Enter your Temperature\n")
    var temperature= readln().toInt()
    if (temperature<36){
        println("Your temp is very low")
    }
    else{
        if (temperature>36 && temperature<45){
            println("Your temp is high")
        }
        else{
            println("Error\n\n")
        }
    }

}