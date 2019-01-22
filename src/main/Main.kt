package main

import factory_method.Car
import factory_method.Plane
import factory_method.Type
import factory_method.VehicleFactory

fun main(arrays: Array<String>){

    /**
     * Factory Method
     *
     * The Factory pattern is used to replace class constructors
     * abstracting the process of object generation so that the type
     * of the object instantiated can be determind at run-time.
     */
    val factory = VehicleFactory()

    println("-----------Factory Method Pattern--------------")
    println("######### Car ###########")
    val car = factory.getVehicle(Type.CAR)
    println("Wheels: "+car.numOfWheels)
    println("Presengers: "+car.numOfPassengers)
    println("has Gas: "+car.hasGas())


    println("######### Plane ###########")
    val plane = factory.getVehicle(Type.PLANE)
    println("Wheels: "+plane.numOfWheels)
    println("Presengers: "+plane.numOfPassengers)
    println("has Gas: "+plane.hasGas())


    /**
     * Abstract Factory
     *
     * The abstract factory pattern is used to provide a client with a set of related
     * or dependant objects. The "family" of objects created by the factory are
     * determined at run-time
     */

    println("-----------Abstract Factory Pattern--------------")
    val carFactory = abstract_factory.VehicleFactory.createFactory<Car>()
    val car1 = carFactory.makeVehicle()
    println("######### Car ###########")
    println("Wheels: "+car1.numOfWheels)
    println("Presengers: "+car1.numOfPassengers)
    println("has Gas: "+car1.hasGas())

    println("######### Plane ###########")
    val planeFactory = abstract_factory.VehicleFactory.createFactory<Plane>()
    val plane2 = planeFactory.makeVehicle()
    println("Wheels: "+plane2.numOfWheels)
    println("Presengers: "+plane2.numOfPassengers)
    println("has Gas: "+plane2.hasGas())

}