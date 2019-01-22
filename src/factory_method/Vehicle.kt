package factory_method

interface Vehicle {
    val numOfWheels : Int
    val numOfPassengers: Int
    fun hasGas(): Boolean
}