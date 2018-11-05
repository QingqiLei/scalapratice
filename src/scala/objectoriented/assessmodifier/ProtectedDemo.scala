package objectoriented.assessmodifier

class ProtectedDemo {

}

/**
  * protected in Scala is more strict than it in Java
  */
class Vehicle {
  protected def checkEngine() = println("checked engine")


}

class Car extends Vehicle {

  def start() {
    checkEngine()
  }

  def tow(car: Car) {
    car.checkEngine()
  }

  def tow(vehicle: Vehicle) {
    //    vehicle.checkEngine() // Exception
  }
}
  class GasStation {
    def fillGas(car: Car) {
      //      vehicle.checkEngine()// Exception
      car.start()

    }
  }


