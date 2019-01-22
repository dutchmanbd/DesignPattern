package abstract_factory

import factory_method.Plane
import factory_method.Vehicle

class PlaneFactory: VehicleFactory() {
    override fun makeVehicle(): Vehicle = Plane(14, 35)
}