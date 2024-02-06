fun main(args: Array<String>) {
    println("Number Range:")
    for (num in 1..4){
        println(num)
    }
    println("Character Range:")
    for (ch in 'A'..'E'){
        println(ch)
    }
    println("\n")

    //Check elements in a range
    val oneToTen = 1..10
    println("3 in oneToTen: ${3 in oneToTen}")
    println("12 in oneToTen: ${12 in oneToTen}\n")

    //rangeTo() and downTo() functions
    val oneToFive = 1.rangeTo(5)
    val sixToThree = 6.downTo(3)
    println("In rangeTo:")
    for (x in oneToFive){
        println(x)
    }
    println("downTo")
    for (n in sixToThree){
        println(n)
    }
    println("\n")
    println("Range step of 2:")
    //Range Step
    val odd = oneToTen.step(2)
    for (n in odd){
        println(n)
    }
    println("\n")
    println("Reversed Range:")
    //Reversed Range
    for (n in oneToFive.reversed()){
        println(n)
    }
}