fun main(args: Array<String>) {
    for (n in 1..10){
        println("Before break loop: $n")
        if (n==5){
            println("I am a terminating loop\n")
            break
        }
    }
    for (ch in 'A'..'C'){
        for (n in 1..3){
            println("$ch and $n")
            if (n==2){
                break
            }
        }
    }
}