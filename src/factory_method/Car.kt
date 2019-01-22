package factory_method

class Car(
    override val numOfWheels: Int,
    override val numOfPassengers: Int
) : Vehicle {
    override fun hasGas(): Boolean = true
}