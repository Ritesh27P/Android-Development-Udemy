package com.example.module_3

data class User(val id: Long, var name: String)

fun main(){

    var name1 = User(1, "Ritesh")
    println(name1.name)
    name1.name = "Raj"
    println(name1.name)

    var user1 = User(1, "Raj")
    println(name1.equals(user1))

    println("User detail ${user1}")

    var updateUser = user1.copy(name="Raj C")
    println(updateUser)

    val (id, name) = updateUser
    print("$id, $name")


}

