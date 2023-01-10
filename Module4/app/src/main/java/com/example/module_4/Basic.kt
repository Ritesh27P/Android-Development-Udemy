package com.example.module_4

fun main(){
    // var number: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    // var number = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    var number = arrayOf(1, 2, 3, 4, 5, 6, 7)
    number[0] = 10

//    print(number.contentToString())
    for (i in number){
        print("${i} ")
    }
    println()

    var mixedList = listOf(1, 5.3f, 44.555, 37409858984585954, "String")


    var fruits = arrayOf(Fruit("Mango", 56.4), Fruit("Grapes", 23.2), Fruit("Lemon", 3.0))
    for (i in fruits){
        println("${i.component1()}, ${i.component2()}")
    }
    for (i in fruits.indices){
        println("${fruits[i].name}")
    }

    val mix = arrayOf(1, "Sunday", 2.3f, Fruit("Apple", 100.3))
    println(mix.contentToString())
}

data class Fruit(val name: String, val price: Double)
