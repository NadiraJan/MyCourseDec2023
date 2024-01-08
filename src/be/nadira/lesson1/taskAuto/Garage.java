package be.nadira.lesson1.taskAuto;

public class Garage {


    private Car car1;
    private Car car2;

    public Garage() {
    }

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
    private void getCarInfo(Car car){
        System.out.println(car.getBrand());
        car.generateSpeed100();
    }
}
