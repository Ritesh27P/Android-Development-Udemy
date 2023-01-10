package com.example.module_4

fun main(){
    var fruits = setOf("Apple", "Mango", "grapes", "Apple")
    println(fruits.size)
    println(fruits)

    val newFruits = fruits.toMutableSet()
    newFruits.add("JackFruit")
    newFruits.add("Pear")
    println(newFruits.size)

    val daysOfWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday", 7 to "Sunday")
    println(daysOfWeek)
    println(daysOfWeek[7])

    for (key in daysOfWeek.keys){
        println("$key is to ${daysOfWeek[key]}")
    }


}