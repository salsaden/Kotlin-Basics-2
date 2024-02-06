fun main(args: Array<String>) {
    myloop@for (x in 'A'..'C'){
        for (n in 1..4){
            if (n==2 || n==4)
                continue@myloop
            println("$x and $n")
        }
    }
}