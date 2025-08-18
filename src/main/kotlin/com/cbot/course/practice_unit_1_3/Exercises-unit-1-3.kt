fun main() {
    daysInWeek()
    UpdateScore()
    printArea()
    printisEven()
    daysInWeek()
    valueOfPi()
    fullName()
    balance()
    checkAge(21)
    calculateDiscountedPrice(120.0, 10)
    UserState()
    checkTemperature(19)
    appleCount(2, 5, 3)
    canOpenDoor(true, true)
    messageCount()
}

/*Assignment 1: Immutable Variable (val)
Task:
Create a variable called daysInWeek with the value 7. Don't write the type — let Kotlin figure it out. */
val daysInWeek = 7;
fun daysInWeek() {
    println(daysInWeek)
}

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
    println("Area is $area")
}

/*
Assignment 4: Explicit Type Declaration
Task:
Make a variable pi with type Double and value 3.14159.
*/
fun valueOfPi() {
    val pi: Double = 3.14159
    println(pi)
}

/*
Assignment 5: Single-Line Comment
Task:
Add a comment explaining a variable that stores a user's .
*/

var userName = "OldMan" // Sets username to OldMan as a mutable variable

/*
Assignment 6: Remainder Operator (%)
Task:
Check if the 25 is even, and store the result in isEven. */

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
Combine firstName and lastName into one variable called fullName.
*/
fun fullName() {
    val firstName = "Bob"
    val lastName = "McFly"
    val fullName = "$firstName $lastName"
    println("Full name is $fullName")
}


/*
Assignment 8: val Reassignment Error
Task:
Why does this code not compile? Fix it and explain in a comment.
*/

// Original code with error
fun balance() {
    var balance = 100
    balance = 120 // We attempt to change an immutable variable. Fixed by setting the correct var type
    println(balance)
}

/*
Assignment 9: Comparison Operators
Task:
Check if myAge is enough to meet requiredAge.
*/

fun checkAge(age: Int): Unit {
    val requiredAge = 20
    return if (age >= requiredAge){
        println("You are of age")
    } else {
        println("You're underaged")
    }
}

/*
Assignment 10: Multi-line Comment
Task:
Describe the logic of code that calculates a price with a discount.
*/
fun calculateDiscountedPrice(originalPrice: Double, discountPercentage: Int): Unit {
    val discountedPrice = originalPrice - (originalPrice * (discountPercentage / 100.0))
    return println("With an $originalPrice and a $discountPercentage% discount, the discounted price is $discountedPrice")
}

/*
Assignment 11: Choosing the Right Data Type
Task:
Store whether a user is active. Pick the best type and assign true.
*/

val isuseractive: Boolean = true
fun UserState() {
    println(isuseractive)
}

/*
Assignment 12: Expression in a Template String
Task:
Print a message about the temperature. If it's over 20, say "It is warm", otherwise say "It is cold".
*/
fun checkTemperature(temperature: Int) {
    val message = if (temperature > 20) "It is warm" else "It is cold"
    println(message)
}

/*
Assignment 13: Combination of Operators
Task:
Count apples in baskets and some extra apples.
*/
fun appleCount(baskets: Int,applesinBasket: Int, extraApples: Int) {
    val totalApples = baskets * applesinBasket + extraApples
    println("Having $baskets baskets of $applesinBasket apples and $extraApples extra apples, there are $totalApples apples in total")
}
/*
Assignment 14: Logical && (AND) Operator
Task:
See if the door can be opened: you need both a key and the password.
*/

fun canOpenDoor(hasKey: Boolean, hasPassword: Boolean) {
    val canOpen = hasKey && hasPassword
    println(canOpen)
}


/*
Assignment 15: Increment Operator
Task:
Increase messageCount by 1 and print the result. */
fun messageCount() {
    var messageCount = 0
    messageCount++
    println(messageCount)
}