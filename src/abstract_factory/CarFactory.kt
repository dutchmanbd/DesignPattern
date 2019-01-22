package abstract_factory

import factory_method.Car
import factory_method.Vehicle

class CarFactory : VehicleFactory() {
    override fun makeVehicle(): Vehicle = Car(4, 30)
}