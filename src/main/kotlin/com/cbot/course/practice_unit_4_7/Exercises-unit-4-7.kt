fun main() {
    checkNumber(-3)
    checkNumber(0)
    checkNumber(7)
    checkNumber(-9)
    checkEvenOdd(7)
    checkEvenOdd(8)
    checkGrade(8)
    checkGrade(5)
    checkGrade(3)
    checkSeason(7)
    printNumbers()
    printMultiplicationTable()
    printEvenNumbers()
    printReversedNumbers()
    printNames()
    sumNumbers()
    checkAdultAge(17)
    checkAdultAge(20)
    printNumbersRange()
    printReversedNumbersRange()
    printOddNumbers()
    printGrade(85)
    checkLargerNumber(2,9)
    printDayName(3)
    sumNumbersRange()


}

/*
# Practice: Kotlin Basics

Try these simple tasks to practice the main topics from our lessons:
**if/else, when, loops, ranges, arrays**.

---

## 1. Conditional Statements (`if/else`)

**Task 1:**
Write a program that checks if a number is positive, negative, or zero.
Print a message for each case.

```kotlin
val number = -3
```
*/

fun checkNumber(number: Int) {
    if (number > 0) {
        println("The number $number is positive.")
    } else if (number < 0) {
        println("The number $number is negative.")
    } else {
        println("The number $number is zero.")
    }
}

/*

**Task 2:**
Check if a number is even or odd. Print the result.

```kotlin
val number = 7
```

---
*/
fun checkEvenOdd(number: Int) {
    if (number % 2 == 0) {
        println("The number $number is even.")
    } else {
        println("The number $number is odd.")
    }
}



/*
## 2. `when` Expression

**Task 1:**
Write a program that takes a variable `grade` (Int) from 1 to 5 and prints:
- "Excellent" for 5
- "Good" for 4
- "Okay" for 3
- "Bad" for 2
- "Terrible" for 1

```kotlin
val grade = 4
```
*/

fun checkGrade(grade: Int) {
    when (grade) {
        5 -> println("Excellent")
        4 -> println("Good")
        3 -> println("Okay")
        2 -> println("Bad")
        1 -> println("Terrible")
        else -> println("Invalid grade")
    }
}


/*
**Task 2:**
Take a variable `month` (Int) from 1 to 12 and print the season ("Winter", "Spring", "Summer", "Autumn").
Use `when` and ranges.

```kotlin
val month = 7
```
*/

fun checkSeason(month: Int) {
    when (month) {
        in 1..3 -> println("Winter")
        in 4..6 -> println("Spring")
        in 7..9 -> println("Summer")
        in 10..12 -> println("Autumn")
        else -> println("Invalid month")
    }
}


/*
---

## 3. Loops and `for` Loops

**Task 1:**
Print all numbers from 1 to 10 using a `for` loop.

```kotlin
```

*/

fun printNumbers() {
    for (i in 1..10) {
        print("$i ")
    }
}

/*
**Task 2:**
Print the multiplication table for 5 (from 1 to 10), like:
```
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
```

```kotlin
```

---
*/

fun printMultiplicationTable() {
    for (i in 1..10) {
        println("5 x $i = ${5 * i}")
    }
}

/*
## 4. Ranges

**Task 1:**
Print all even numbers from 2 to 20 using a range and a loop.

```kotlin
```
*/

fun printEvenNumbers() {
    for (i in 2..20 step 2) {
        print("$i ")
    }
}


/*
**Task 2:**
Print numbers from 10 down to 1 using a reversed range.

```kotlin
```

---
*/

fun printReversedNumbers() {
    for (i in 10 downTo 1) {
        print("$i ")
    }
}


/*
## 5. Arrays

**Task 1:**
Create an array of names (`"Tom"`, `"Sam"`, `"Bob"`).
Print each name on a new line using a loop.

```kotlin
```
*/

fun printNames() {
    val names = arrayOf("Tom", "Sam", "Bob")
    for (name in names) {
        println(name)
    }
}


/*
**Task 2:**
Create an array of 5 numbers.
Print the sum of all numbers in the array.

```kotlin
```
*/

fun sumNumbers() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    println("Sum of numbers: $sum")
}



/*
---
# Extra Practice — Units 4–7 (If/Else, When, Loops, Ranges)

## Tasks

---

### 1. If/Else Conditionals

**Task 1:**
Given a variable `age`, print "Adult" if age is 18 or older, otherwise print "Minor".

```kotlin
val age = 17
```
*/

fun checkAdultAge(age: Int) {
    if (age >= 18) {
        println("Adult")
    } else {
        println("Minor")
    }
}


/*
**Task 2:**
Given two variables `a` and `b`, print the larger number.

```kotlin
val a = 15
val b = 20
```

---
*/

fun checkLargerNumber(a: Int, b: Int) {
    if (a > b) {
        println("The larger number is: $a")
    } else {
        println("The larger number is: $b")
    }
}

/*
### 2. When Expression

**Task 1:**
Given a variable `day` (1–7), print the name of the day (1–Monday, 2–Tuesday, ..., 7–Sunday).

```kotlin
val day = 3
```
*/
fun printDayName(day: Int) {
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day")
    }
}

/*
**Task 2:**
Given a variable `score` (0–100), print:
- "A" if score >= 90
- "B" if score >= 80
- "C" if score >= 70
- "D" if score >= 60
- "F" otherwise

```kotlin
val score = 85
```
*/

fun printGrade(score: Int) {
    when {
        score >= 90 -> println("A")
        score >= 80 -> println("B")
        score >= 70 -> println("C")
        score >= 60 -> println("D")
        else -> println("F")
    }
}

/*
---

### 3. Loops

**Task 1:**
Print all odd numbers from 1 to 15.

---
*/

fun printOddNumbers() {
    for (i in 1..15 step 2) {
        print("$i ")
    }
}

/*
**Task 2:**
Print the sum of all numbers from 1 to 5.

---
*/

fun sumNumbersRange() {
    var sum = 0
    for (i in 1..5) {
        sum += i
    }
    println("Sum of numbers: $sum")
}


/*
### 4. Ranges

**Task 1:**
Print all numbers from 5 to 15.
---
*/

fun printNumbersRange() {
    for (i in 5..15) {
        print("$i ")
    }
}

/*
**Task 2:**
Print all numbers from 20 down to 10.

---
*/

fun printReversedNumbersRange() {
    for (i in 20 downTo 10) {
        print("$i ")
    }
}