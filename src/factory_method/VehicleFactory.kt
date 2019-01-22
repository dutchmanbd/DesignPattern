package factory_method

/**
 * Vehicle Factory create vehicle with given specefic type
 */
class VehicleFactory {
    fun getVehicle(type: Type): Vehicle{
        return when(type){
            Type.CAR -> Car(4, 4)
            Type.PLANE -> Plane(14, 30)
        }
    }
}