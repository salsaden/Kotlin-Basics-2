fun main(args: Array<String>) {
    myloop@ for (ch in 'A'..'C'){
        myloop2@for (n in 1..4){
            println("$ch and $n")
            if (n==3){
                break@myloop2
            }
        }
    }
}