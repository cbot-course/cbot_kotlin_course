package com.cbot.course.chapter1.extra

fun main() {
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
    } else if (a == b ) {
        println("Numbers are equal")
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