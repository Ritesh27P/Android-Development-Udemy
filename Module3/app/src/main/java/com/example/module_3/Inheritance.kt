package com.example.module_3

open class Vehicle(){
    //properties
}

open class CAR(val name: String, val brand: String){
    open var range = 0.0

    fun extendRange(amount: Double){
        if (range > 0) {
            range += amount
        }
    }

    open fun drive(distance: Double){
        println("Drove for $distance")
    }

}

class ElectricCar(name: String, brand: String, batteryLife: Double): CAR(name, brand){
    override var range = batteryLife * 5

    override fun drive(distance: Double){
        println("Drove for $distance KM in electric car")
    }

    fun drive(){
        println("You drive $range range.")
    }

}

fun main(){
    var car1 = CAR("A1", "Audi")
    var electricC = ElectricCar("S-5", "Tesla", 85.0)

    car1.drive(200.0)
    electricC.drive(150.0)
    electricC.extendRange(450.0)
    electricC.drive()
}
