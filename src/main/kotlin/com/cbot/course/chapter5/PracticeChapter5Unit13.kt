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