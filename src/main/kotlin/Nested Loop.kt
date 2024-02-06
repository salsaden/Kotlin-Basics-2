fun main(args: Array<String>) {
    for (ch in 'A'..'D'){
        for (n in 1..5){
            if (n==2 || n==4)
                continue
            println("$ch and $n")
        }

    }
}