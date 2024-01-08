package be.nadira.lesson1.oopLesson2;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Cat {

    public String color;
    double weight;
    private String ownerName;

    public Cat() {
    }

    public Cat(String color, double weight, String ownerName) {
        this.color = color;
        this.weight = weight;
        this.ownerName = ownerName;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void catSpeaks() {  //void returns nothing
        System.out.println(this.color + " cat miauw");

    }
    //other method with String
    public void destroySofa(String sofaOwner){
        System.out.printf("A cat destroys a sofa of %s\n", sofaOwner);
    }

    // method with return type to save
    public String hunt(boolean isDay) {
        if (isDay) {
            return "Mouse";    //no need to use ELSE
        }
            return "Owl";
    }
    public String hunt(boolean isDay, boolean success){
        if(success){
            if(isDay){
                return "mouse";
            }
            return "owl";

        }
        return "Nothing";
    }
    public void feed(String giver, String... product){
        System.out.printf(" Giver %s, Cat has eaten: %s\n", giver, Arrays.toString(product));
    }  //overloaded method not good

    public void hunt(String timesOfDay) {
        if (timesOfDay.equals("Morning")) {
            System.out.println("Mouse");
        } else {
            System.out.println("Insect");
        }
    }


        @Override
        public String toString () {
            return "Cat{" +
                    "color='" + color + '\'' +
                    ", weight=" + weight +
                    ", ownerName='" + ownerName + '\'' +
                    '}';

    }
}