package main.kotlin.com.cbot.course.chapter5

fun main() {

    println(Student("Bob", listOf(90, 80, 85)).averageGrade())
    println(MathUtils().sumOfEvenNumbers(listOf(1, 2, 3, 4, 5, 6)))
    println(NameCollector().collectUniqueNames(listOf("Bob", "Alice", "Bob", "Charlie")))
    println(DuplicateChecker().isDuplicate(setOf(1, 2, 3), number = (3)))

    val phoneBook = PhoneBook()
    phoneBook.addContact("Bob", "123-456-7890")
    phoneBook.addContact("Alice", "987-654-3210")
    phoneBook.addContact("Charlie", "555-555-5555")
    println(phoneBook.findPhoneNumber("Alice"))

    println(FrequencyCounter().countWords(listOf("apple", "banana", "apple", "apple", "orange")))
    println(evenNumbersSequence().take(5).toList())
    println(filterSequence(listOf(1, 2, 3, 4, 5, 6, 7, 99, 12, 10)).toList())
    println(swapElements(arrayOf("a", "b", "c")))
    println(sumArray(arrayOf(1, 2, 3, 4, 5)))
    println(filterNamesByLength(listOf("Alice", "Bob", "Charlie", "David")))
    println(filterNotNulls(listOf(1, null, 2, null, 3)))
    println(containsCheck(listOf("apple", "banana", "orange"), "banana"))
    println(allPositive(listOf(1, 2, 3, 4, 5)))
    println(uppercaseAll(listOf("apple", "banana", "orange")))
    println(doubleNumbers(listOf(1, 2, 3, 4, 5)))
    println(groupByFirstLetter(listOf("apple", "banana", "orange", "apricot")))
    println(groupByLength(listOf("apple", "banana", "orange", "apricot")))
    println(sortByLength(listOf("apple", "banana", "orange", "apricot")))
    println(sortDescending(listOf(1, 2, 3, 4, 5)))
    println(findMax(listOf(1, 2, 3, 4, 5)))
    println(averageScore(listOf(1, 2, 3, 4, 5)))
    println(addElements(listOf(1, 2, 3), listOf(4, 5, 6)))
    println(subtractElements(listOf(1, 2, 3), listOf(2, 3, 4)))
    println(takeFirstN(listOf(1, 2, 3, 4, 5), 3))
    println(chunkList(listOf(1, 2, 3, 4, 5)))
    println(getByIndexSafe(listOf(1, 2, 3, 4, 5), 2))
    println(getRandomElement(listOf(1, 2, 3, 4, 5)))
}

/*
List Tasks
1. Student Grades
Create a class called Student.
Each student has a name and a list of grades (Int).
Write a function inside the class that calculates the average grade of the student.
*/

class Student(val name: String, val grades: List<Int>) {
    fun averageGrade(): Double {
        return if (grades.isEmpty()) {
            0.0
        } else {
            grades.sum().toDouble() / grades.size
        }
    }
}

/*
2. Math Utilities
Create a class called MathUtils.
Add a function that takes a list of integers and returns the sum of all even numbers in the list.
*/

class MathUtils {
    fun sumOfEvenNumbers(numbers: List<Int>): Int {
        return numbers.filter { it % 2 == 0 }.sum()
    }
}

/*
Set Tasks
1. Unique Names
Create a class called NameCollector.
Add a function that takes a list of names (String) and returns a set with only unique names.
*/

class NameCollector {
    fun collectUniqueNames(names: List<String>): Set<String> {
        return names.toSet()
    }
}

/*
2. Duplicate Checker
Create a class called DuplicateChecker.
Write a function that takes a set of numbers and a number to check, and returns true if the number is already in the set, otherwise false.
*/

class DuplicateChecker {
    fun isDuplicate(set: Set<Int>, number: Int): Boolean {
        return number in set
    }
}

/*
Map Tasks
1. Phone Book
Create a class called PhoneBook.
Add a function to add a contact (name and phone number) to the phone book (use a map).
Also, add a function to find a phone number by name.
*/

class PhoneBook {
    private val contacts = mutableMapOf<String, String>()

    fun addContact(name: String, phoneNumber: String) {
        contacts[name] = phoneNumber
    }

    fun findPhoneNumber(name: String): String? {
        return contacts[name]
    }
}

/*
2. Frequency Counter
Create a class called FrequencyCounter.
Write a function that takes a list of words and returns a map with each word and the number of times it appears in the list.
*/

class FrequencyCounter {
    fun countWords(words: List<String>): Map<String, Int> {
        return words.groupingBy { it }.eachCount()
    }
}

/*
Unit 4: Sequence
1. Even Numbers Sequence
Create a sequence of even numbers from 2 to 20. Print the first 5 numbers.
*/

fun evenNumbersSequence(): Sequence<Int> {
    return sequence {
        for (i in 2..20 step 2) {
            yield(i)
        }
    }
}

/*
2. Filter Sequence
Write a function using a sequence to filter out numbers less than 10 from a list of integers.
*/

fun filterSequence(numbers: List<Int>): Sequence<Int> {
    return sequence {
        for (number in numbers) {
            if (number >= 10) {
                yield(number)
            }
        }
    }
}

/*
Unit 5: Array
1. Swap Elements
Write a function that swaps the first and last elements of an array of strings.
*/

fun swapElements(array: Array<String>): Array<String> {
    val temp = array[0]
    array[0] = array[array.lastIndex]
    array[array.lastIndex] = temp
    return array
}

/*
2. Sum Array
Create a function that takes an array of integers and returns the sum of all elements.
*/

fun sumArray(array: Array<Int>): Int {
    return array.sum()
}

/*
Unit 6: Filtering Collections
1. Filter Names by Length
Write a function that takes a list of names and returns only those names that have more than 4 letters.
*/

fun filterNamesByLength(names: List<String>): List<String> {
    return names.filter { it.length > 4 }
}

/*
2. Filter Not Nulls
Create a function that takes a list of nullable integers and returns a list of only non-null values.
*/

fun filterNotNulls(numbers: List<Int?>): List<Int> {
    return numbers.filterNotNull()
}

/*
Unit 7: Checking Elements
1. Contains Check
Write a function that checks if a given string is present in a list of strings.
*/

fun containsCheck(list: List<String>, string: String): Boolean {
    return list.contains(string)
}

/*
2. All Positive
Create a function that checks if all elements in a list of integers are positive.
*/

fun allPositive(list: List<Int>): Boolean {
    return list.all { it > 0 }
}

/*
Unit 8: Transformations
1. Uppercase All
Write a function that takes a list of strings and returns a new list with all strings in uppercase.
*/

fun uppercaseAll(list: List<String>): List<String> {
    return list.map { it.uppercase() }
}

/*
2. Double Numbers
Create a function that takes a list of integers and returns a list of their doubles.
*/

fun doubleNumbers(list: List<Int>): List<Int> {
    return list.map { it * 2 }
}

/*
Unit 9: Grouping
1. Group by First Letter
Write a function that groups a list of words by their first letter and returns a map.
*/

fun groupByFirstLetter(words: List<String>): Map<Char, List<String>> {
    return words.groupBy { it.first() }
}

/*
2. Group by Length
Create a function that takes a list of words and groups them by length.
*/

fun groupByLength(words: List<String>): Map<Int, List<String>> {
    return words.groupBy { it.length }
}

/*
Unit 10: Sorting
1. Sort By Length
Write a function that takes a list of strings and returns a new list sorted by string length.
*/

fun sortByLength(list: List<String>): List<String> {
    return list.sortedBy { it.length }
}

/*
2. Sort Descending
Create a function that takes a list of numbers and returns them sorted in descending order.
*/

fun sortDescending(list: List<Int>): List<Int> {
    return list.sortedDescending()
}
/*
Unit 11: Aggregate Operations
1. Find Max
Write a function that takes a list of numbers and returns the largest number.
*/

fun findMax(list: List<Int>): Int {
    return list.maxOrNull() ?: 0
}

/*
2. Average Score
Create a function that takes a list of scores and returns the average score.
*/

fun averageScore(scores: List<Int>): Double {
    return scores.average()
}

/*
Unit 12: Add, Subtract, Union
1. Add Elements
Write a function that adds two lists together and returns the combined list.
*/

fun addElements(list1: List<Int>, list2: List<Int>): List<Int> {
    return list1 + list2
}

/*
2. Subtract Elements
Create a function that takes two lists and returns a list with elements from the first list that are not in the second.
*/

fun subtractElements(list1: List<Int>, list2: List<Int>): List<Int> {
    return list1.filterNot { it in list2 }
}

/*
Unit 13: Get Part
1. Take First N
Write a function that takes a list and an integer n, and returns the first n elements of the list.
*/

fun takeFirstN(list: List<Int>, n: Int): List<Int> {
    return list.take(n)
}
/*
2. Chunk List
Create a function that splits a list into chunks of size 2 and returns a list of lists.
*/

fun chunkList(list: List<Int>): List<List<Int>> {
    return list.chunked(2)
}
/*
Unit 14: Get Individual Elements
1. Get by Index Safe
Write a function that returns the element at a given index from a list, or "Not found" if the index is out of bounds.
*/

fun getByIndexSafe(list: List<Int>, index: Int): String {
    return if (index in list.indices) list[index].toString() else "Not found"
}

/*
2. Get Random Element
Create a function that returns a random element from a list, or null if the list is empty.
 */

fun getRandomElement(list: List<Int>): Int? {
    return list.randomOrNull()
}
