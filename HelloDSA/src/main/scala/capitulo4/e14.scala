package capitulo4

//package org.transport.vehicles
//  class Car

package org
  package trasport

    package vehicle {

      import capitulo4.org.trasport.fuel.Fuel

      class Car(fuel: Fuel) {
        println("Car created using " + fuel)
      }
}

  package fuel {

    abstract class Fuel
    class Gasoline extends Fuel
    class Alcohol extends Fuel
  }

//import capitulo4.org.trasport.fuel.{Alcohol, Gasoline} ou
import capitulo4.org.trasport.fuel._

import capitulo4.org.trasport.vehicle.Car

object e14 {

  def main(args: Array[String]): Unit = {
    val fuel2 = new Alcohol
    val fuel = new Gasoline
    val car = new Car(fuel)
  }
}
