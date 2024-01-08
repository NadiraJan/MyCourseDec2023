package be.nadira.lesson1.myWorks;

import be.nadira.lesson1.taskAuto.Car;

public class Garage {

    Car car1;
    Car car2;

    public void setCar1(Car car1) {
        this.car1 = car1;
    }

    public void setCar2(Car car2) {
        this.car2 = car2;
    }

    public void getCarsInfo(){
        getCarInfo(car1);
        getCarInfo(car2);

    }
    public void getCarInfo(Car car){

        System.out.println(car.getBrand());
        car.generateSpeed100();

    }
}
