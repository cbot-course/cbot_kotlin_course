/*Assignment 1: Immutable Variable (val)
Task:
Create a variable called daysInWeek with the value 7. Don't write the type — let Kotlin figure it out. */

val daysInWeek = 7;


/* Assignment 2: Mutable Variable (var)
Task:
Make a variable called userScore with a starting value of 0. Add 10 to it and print the result. */

fun UpdateScore() {
    var userScore = 0;
    userScore += 10;

    println(userScore)
}

/*
Assignment 3: Arithmetic Operators
Task:
Create width and height variables. Find the area of a rectangle. */

var width = 10
var height = 15
var area = width * height

fun printArea() {
    println(area)
}

/*
Assignment 4: Explicit Type Declaration
Task:
Make a variable pi with type Double and value 3.14159.
*/

val pi: Double = 3.14159

/*

Assignment 5: Single-Line Comment
Task:
Add a comment explaining a variable that stores a user's name. */

var userName = "OldMan" // Sets username to OldMan as a mutable variable

/*
Assignment 6: Remainder Operator (%)
Task:
Check if the number 25 is even, and store the result in isEven. */

fun checkEven(number : Int): Boolean {

    if (number % 2 == 0) {
        return true
    } else {
        return false
    }
}

var isEven = checkEven(25);

fun printisEven() {
    println(isEven)
}

/*

Assignment 7: Template Strings
Task:
Combine firstName and lastName into one variable called fullName. */

var firstName = "Bob"
var lastName = "McFly"

var fullName = "$firstName $lastName"


/*
Assignment 8: val Reassignment Error
Task:
Why does this code not compile? Fix it and explain in a comment.
*/

// Original code with error
fun main() {
    var balance = 100
    balance = 120 // We attempt to change an immutable variable. Fixed by setting the correct var type
    println(balance)
}

/*
Assignment 9: Comparison Operators
Task:
Check if myAge is enough to meet requiredAge.
*/

val requiredAge = 20

fun checkAge(age: Int): String {
    return if (age >= requiredAge){
        "You are of age"
    } else {
        "You're underaged"
    }
}


/*

Assignment 10: Multi-line Comment
Task:
Describe the logic of code that calculates a price with a discount.

Assignment 11: Choosing the Right Data Type
Task:
Store whether a user is active. Pick the best type and assign true.

Assignment 12: Expression in a Template String
Task:
Print a message about the temperature. If it's over 20, say "It is warm", otherwise say "It is cold".

Assignment 13: Combination of Operators
Task:
Count apples in baskets and some extra apples.

Assignment 14: Logical && (AND) Operator
Task:
See if the door can be opened: you need both a key and the password.

Assignment 15: Increment Operator
Task:
Increase messageCount by 1 and print the result. */