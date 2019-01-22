package factory_method

class Plane(
    override val numOfWheels: Int,
    override val numOfPassengers: Int
) : Vehicle {
    override fun hasGas(): Boolean = false
}