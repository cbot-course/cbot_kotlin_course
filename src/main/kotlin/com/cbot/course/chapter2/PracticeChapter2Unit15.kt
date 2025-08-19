package main.kotlin.com.cbot.course.chapter2

fun main() {
    greet("Bob")
    displayUser("Bob", 11)
    showMessage("Hello World")
    printNumbers(22, 33, 44, 55)
    concatStrings("Hello", "World")
    addToGroup("Group 1", "Alice", "Bob", "Charlie")
    println(multiply(2, 3))
    println(isEven(4))
    printIfPositive(5)
    println(cube(231))
    checkAndPrint(5)
    compare(22, 12)
    show("Hello")
    show(22)
    println(max(22, 33))
    println(max(22.0, 33.0))
    println(sum(22, 33))
    println(sum(22, 33, 44))

}

/*
# Practice Tasks: Chapter 2: Units 1-5

---

## Unit 1. Functions and Their Parameters

1. Write a function called `greet` that takes a name (String) as a parameter and prints "Hello, [name]!".
2. Write a function called `displayUser` that takes two parameters: a name (String) and an age (Int), and prints "Name: [name], Age: [age]".
3. Write a function called `showMessage` that takes a message (String) and prints it. Try calling it with different messages.

---
*/

fun greet(name: String) {
    println("Hello, $name!")
}

fun displayUser(name: String, age: Int) {
    println("Name: $name, Age: $age")
}

fun showMessage(message: String) {
    println(message)
}


/*
## Unit 2. Vararg Parameters

1. Write a function called `printNumbers` that takes a variable number of integers and prints each one on a new line.
2. Write a function called `concatStrings` that takes a variable number of strings and prints them as a single line separated by spaces.
3. Write a function called `addToGroup` that takes a group name (String), any number of user names (String), and prints the group name and all users.

---
*/

fun printNumbers(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

fun concatStrings(vararg strings: String) {
    println(strings.joinToString(" "))
}

fun addToGroup(groupName: String, vararg users: String) {
    println("$groupName: ${users.joinToString(", ")}")
}

/*
## Unit 3. Returning Results

1. Write a function called `multiply` that takes two Int parameters and returns their product.
2. Write a function called `isEven` that takes an Int and returns true if the number is even, false otherwise.
3. Write a function called `printIfPositive` that takes an Int and prints the number only if it is positive (use `return` to exit early).

---
*/

fun multiply(a: Int, b: Int): Int {
    return a * b
}
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun printIfPositive(number: Int) {
    if (number <= 0) {
        return
    }
    println(number)
}

/*
## Unit 4. Single-Expression and Local Functions

1. Write a single-expression function called `cube` that returns the cube of a given Int.
2. Write a function called `checkAndPrint` that takes an Int, defines a local function `isValid` to check if the number is positive, and prints "Valid" or "Invalid".
3. Write a function `compare` that takes two Ints and a local function that returns true if both are less than 10. Print "Both less than 10" or "Not both less than 10".

---
*/

fun cube(number: Int) = number * number * number

fun checkAndPrint(number: Int) {
    fun isValid() = number > 0

    if (isValid()) {
        println("Valid")
    } else {
        println("Invalid")
    }
}

fun compare(a: Int, b: Int) {
    fun areBothLessThan10() = a < 10 && b < 10

    if (areBothLessThan10()) {
        println("Both less than 10")
    } else {
        println("Not both less than 10")
    }
}

/*
## Unit 5. Function Overloading

1. Write two functions with the same name `show` — one that takes a String and prints it, another that takes an Int and prints it.
2. Write two functions called `max`: one that takes two Ints and returns the larger, another that takes two Doubles and returns the larger.
3. Write two functions named `sum`: one that takes two Ints, and one that takes three Ints, and both return the sum.

---

*/

fun show(message: String) {
    println(message)
}

fun show(number: Int) {
    println(number)
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun max(a: Double, b: Double): Double {
    return if (a > b) a else b
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum(a: Int, b: Int, c: Int): Int {
    return a + b + c
}