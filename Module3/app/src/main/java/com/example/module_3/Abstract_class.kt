package com.example.module_3

abstract class Mammal(private val name: String,
                        private val origin: String,
                        private val weight: Double)
{
    // Must be override by the Subclass (Abstract Property)
    abstract var maxSpeed: Double

    // Must bee implemented by Subclass (Abstract methods)
    abstract fun run()
    abstract fun breath()

    // Concrete (Non-Abstract) methods
    fun displayDetail(){
        println("Name $name, Origin $origin, Weight $weight, Max_Speed $maxSpeed")
    }
}

abstract class Robot(private var name: String){
    abstract fun processor()
}

open class Human(name: String, origin: String, weight: Double, override var maxSpeed: Double): Mammal(name, origin, weight){
    override fun breath() {
        println("Breath through mouth and nose")
    }

    override fun run(){
        println("Run using two legs.")
    }
}

class Elephant(name: String, origin: String, weight: Double, override var maxSpeed: Double)
    : Mammal(name, origin, weight){

        override fun run(){
            println("Run on 4 legs")
        }

        override fun breath() {
            println("Breath using trunk")
        }

    }

class RAj(name: String, origin: String, weight: Double, maxSpeed: Double): Human(name, origin, weight, maxSpeed){
    fun model(){
        println("Model-93A57")
    }
}

fun main(){
    var Ritesh = Human("Ritesh", "Monkey", 64.7, 23.1)
    var Glory = Elephant("Glory", "Elephant", 230.6, 35.7)

    Ritesh.run()
    Glory.run()

    Ritesh.breath()
    Glory.breath()

    var r1 = RAj("RAj", "Robot", 150.3, 40.1)
    r1.model()
}