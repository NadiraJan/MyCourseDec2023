package be.nadira.lesson1.taskAuto;

public class CarApp {
    public static void main(String[] args) {

        Car nadiraCar = new Car("NadiraCar");
        nadiraCar.generateSpeed100();

        Car superCar = new Car("SuperCar", 400);
        superCar.generateSpeed100();

        Garage garage = new Garage();
        garage.setCar1(nadiraCar);
        garage.setCar2(superCar);
        garage.getCarsInfo();



    }
}
