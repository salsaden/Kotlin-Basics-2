fun main(args: Array<String>) {
    var fname = "Aden"
    var lname = "Salma"
    fname = fname+" "+ lname
    println("$fname")

    //Getting String Length
    println("The length is: ${fname.length}\n")

    //Comapre Strings
    var str1 = "SALMAADEN"
    var str2 = "salmaaden"
    //true is equals otherwise false
    println("String equals?: ${str1.equals(str2)}")
    // returns 0 is equals otherwise false
    println("String equals?: ${str1.compareTo(str2)}\n")

    var str = "Emobilis"
    println("2nd index: ${str.get(2)}")
    println("2nd index: ${str[5]}\n")

    var str4 = "Givethemaname"
    println("Index 3 to 6:"+ str4.subSequence(2,5))

    //check a string contains another string
    var str5 = "salmaaden.ac.ke"

        println("Contains .ac: ${str5.contains(".ac")}")
    


}