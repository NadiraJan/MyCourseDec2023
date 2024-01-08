package be.nadira.lesson1.taskAuto;

public class Car {

    private String brand;
    private int maxSpeed = 220;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void generateSpeed100(){

   double speed = 110d / (this.maxSpeed / 20d);

        //110/(maxSpeed / 20)

        System.out.printf("Speed till 100 km/h : %s\n", speed);
    }
}
