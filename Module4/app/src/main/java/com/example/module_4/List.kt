package com.example.module_4

fun main(){

    var month = listOf("Jan", "Feb", "Mar", "April")
    println(month)
    println(month.size)
    println(month[1])

    println(month.get(3))
    // drawback of unmutable list is we cannot add object into it

    // here, mutablelist comes to rescue
    var mutableMonth = month.toMutableList()

    mutableMonth.add("May")
    println(mutableMonth)

    var newMonth = arrayOf("June", "July")
    mutableMonth.addAll(newMonth)
    println(mutableMonth)
    mutableMonth.removeAt(6)
    println(mutableMonth)

    mutableMonth.removeAll(mutableMonth)
    println(mutableMonth)



}