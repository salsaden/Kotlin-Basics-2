fun main(args: Array<String>) {
    var arr = arrayOf(10, "Salma", 10.99, 'A')
    var arr1 = arrayOf<Int>(1,22,90)
    var arr3 = arrayOf<String>("ab", "Let's do it")

    //Accessing array elements in kotlin
    println(arr[3])

    //modify the 4th element
    arr[3] = 200
    println(arr[3])

    // set() function
    println(arr1.get(2))
    //get() function
    println(arr.get(2))
    arr.set(2,23.45)
    println(arr.get(2))

    //size of an array
    var arr4 = arrayOf(1,2,3,4,5,6)
    println("Size of the Array is: ${arr4.size}")

    //checking elements in an array
    var arr5 = arrayOf(1, 34, "Sareyo")
    println("Array contains Sareyo: ${arr5.contains("Sareyo")}")
    //first() and last() functions
    println("First Element: ${arr5.first()}")
    println("First Element: ${arr5.last()}")
    //finding the index of an element in an array
    println("Index of 34: ${arr5.indexOf(34)}")


}