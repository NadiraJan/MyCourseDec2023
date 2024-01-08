package be.nadira.lesson1.myWorks;

public class Auto {

    private String brand;
    private int maxSpeed = 220;

    public Auto(String brand) {
        this.brand = brand;
    }

    public Auto(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void generateSpeed(double speed){

        System.out.println("Generate a speed till 100km/h: " + this.maxSpeed / 20);
    }
}
