package com.example.module_3

interface Driveable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The driveable is braking")
    }
}

open class CAR1(override val maxSpeed: Double, val name: String, val brand: String):
    Driveable{
    open var range = 0.0

    fun extendRange(amount: Double){
        if (range > 0) {
            range += amount
        }
    }

    // class inplementing interface must contain all the properties and method which is suppose to be declared
    override fun drive(): String = "driving the interface drive"

    // doesn't follow the structure (returning the string)
    open fun drive(distance: Double){
        println("Drove for $distance")
    }

}

class ElectricCar1(maxSpeed: Double, name: String, brand: String, batteryLife: Double): CAR1(maxSpeed, name, brand){
    override var range = batteryLife * 5

    override fun drive(distance: Double){
        println("Drove for $distance KM in electric car")
    }

    override fun drive(): String{
        return "You drive $range range."
    }

    override fun brake(){
        super.brake()
        super.drive(555.5)
        println("The electric car brake")
    }

}

fun main(){
    var car1 = CAR1(250.0, "A1", "Audi")
    var electricC = ElectricCar1(190.4, "S-5", "Tesla", 85.0)

    car1.drive(200.0)
    electricC.drive(150.0)
    electricC.extendRange(450.0)
    electricC.drive()
    electricC.brake()
}
