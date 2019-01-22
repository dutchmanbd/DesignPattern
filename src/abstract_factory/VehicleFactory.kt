package abstract_factory

import factory_method.Car
import factory_method.Plane
import factory_method.Vehicle

abstract class VehicleFactory {
    abstract fun makeVehicle(): Vehicle

    companion object {
        inline fun <reified T: Vehicle> createFactory(): VehicleFactory = when(T::class){
            Car::class -> CarFactory()
            Plane::class -> PlaneFactory()
            else -> throw IllegalArgumentException()
        }
    }
}