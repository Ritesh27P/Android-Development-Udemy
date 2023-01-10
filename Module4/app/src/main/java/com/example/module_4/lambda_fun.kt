package com.example.module_4

fun main(){
    addNumber(5,3 )

    val sum: (Int, Int)-> Int = {a:Int, b:Int -> a+b}
    println(sum(5, 3))

    val Add = {a:Int, b:Int -> a+b}
    println(Add(5, 3))


    val printk: () -> Char = {'k'}
    println(printk())
}

fun addNumber(a:Int, b:Int){
    println(a+b)
}