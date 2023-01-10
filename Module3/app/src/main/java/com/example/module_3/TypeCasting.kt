package com.example.module_3

import java.lang.Math.floor

fun main(){
    var stringList: List<String> = listOf("Ritesh", "Ankit", "Raj", "Vijay")

    var mixedList: List<Any> = listOf("Ritesh", 1, 2.33f, "RRR")

    for (i in mixedList){
        if (i is Int) println(i)
        if (i is Float) println("$i")
//        if (i is String) println(i)
    }

    var obj = "I have dream"
    var str: String? = obj as? String
    println(str)
    println(obj as? String)

}