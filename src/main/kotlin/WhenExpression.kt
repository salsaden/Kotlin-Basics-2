fun main(args: Array<String>) {
    var ch ='I'
    when(ch){
        'A' -> println("This is a vowel\n")
        'E' -> println("This is a vowel\n")
        'I' -> println("This is a vowel\n")
        'O' -> println("This is a vowel\n")
        'U' -> println("This is a vowel\n")


        else -> println("Its a consonant\n")

    }

    var age = 10

    when(age) {
        in 1..17 -> {
            val num = 18 - age
            println("\nYou will be eligible for voting in $num years")
        }
        in 18..100 -> println("You are eligible for voting")
    }


}