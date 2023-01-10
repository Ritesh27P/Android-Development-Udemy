package com.example.module_4

//unsafe cast operator -> as
// it will return error if casting is not possible


// safe cast operator -> as?
// it will return null if casting is not possible

fun main(){
    var obj: Any? = null
    // will return error coz of unsafe casting (obj is not a String)
    // var str: String = obj as String

    var str: String? = obj as? String
    println(str)

    obj = "I have Dream"
    var str1: String? = obj as? String
    println(str1)

}