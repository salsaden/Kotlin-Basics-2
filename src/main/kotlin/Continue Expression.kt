fun main(args: Array<String>) {
    for (n in 1..5){
        println("Before continue: Loop, $n")
        if (n==2 || n==4)
            continue
        println("After continue: Loop, $n \n")
    }
    for (n in 1..10){
        if (n%2!=0)
            continue
        println("$n")
    }
}