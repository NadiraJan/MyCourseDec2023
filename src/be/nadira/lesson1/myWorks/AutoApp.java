package be.nadira.lesson1.myWorks;

import be.nadira.lesson1.taskAuto.Car;

public class AutoApp {
    public static void main(String[] args) {

    Car nadiraCar = new Car("NadiraCar", 200);
    Car superCar = new Car("SuperCar", 400);

/*    nadiraCar.generateSpeed100();
    superCar.generateSpeed100();*/

        Garage garage = new Garage();
        garage.setCar1(nadiraCar);
        garage.setCar2(superCar);
        garage.getCarsInfo();

}
  }