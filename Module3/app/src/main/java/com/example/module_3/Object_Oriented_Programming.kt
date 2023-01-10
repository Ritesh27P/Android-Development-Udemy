package com.example.module_3

fun main(){
    var Ritesh = Person("Ritesh", "Pachangane", 19)
    Ritesh.hobby = "Running"
    Ritesh.stateHobby()
//    var Random = Person()
//    Random.hobby = "Chess"
//    Random.stateHobby()
//    var john = Person("John", "Constatine", 38)
//    var galaxyf41 = MobilePhone("OneUI", "Samsung", "F41")

    var myCar = Car()
    println(myCar.myBrand)
    myCar.maxSpeed = 200
    println(myCar.maxSpeed)
//    myCar.myModel = "S1"

}



class Person(firstName: String = "John", lastName: String = "Doe"){

    // Members Variable - Properties
    var age: Int? = null
    var hobby: String = "watching Netflix"
    var fName: String? = null
    var lName: String? = null

    // Initializer Block (Constructor)
    init {
        this.fName = firstName
        this.lName = lastName
        println("Person Created with name $firstName $lastName")
    }

    // Members Constructor (Secondary Constructor)
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName)
    {
        this.age = age
        println("Name is $firstName $lastName with age $age")
    }

    fun stateHobby(){
        println("$fName hobby is $hobby")
    }
}

class Car(){
    lateinit var owner: String

    val myBrand: String = "BMW"
    get() {
        return field.lowercase()
    }

    var maxSpeed: Int = 250
        get() = field
        set(value){
            field = if (value > 0) value else throw IllegalAccessError("Maximum speed cannot be negative")
        }

    var myModel = "F5"
        private set

    init {
        this.myModel = "M3"
        this.owner = "Ritesh"
    }
}



class MobilePhone(OsName: String, Brand: String, model: String){

    init{
        println("$Brand mobile has $OsName OS and model is $model")
    }
}
