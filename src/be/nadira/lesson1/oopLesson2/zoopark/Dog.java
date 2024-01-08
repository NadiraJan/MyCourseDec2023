package be.nadira.lesson1.oopLesson2.zoopark;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Dog {
    private String name;
    private int weight;
    private String owner;

    {  System.out.println("A dog is born");
    }//initialization block!!! inside {}

    public Dog() {
    }

    public Dog(String name, int weight, String owner) {

        this.name = name;
        this.weight = weight;
        this.owner = owner;


    }

    public void setWeight(int weight) {
        this.weight = weight;

        if(weight < 1){
            this.weight = 5;
        } else {
            this.weight = weight;
        }
    }
    public String getOwner(){
        return "Mr. " + owner;
    }

    public void feed(String giver, String...product){
        System.out.printf(" Giver %s, Dog has eaten: %s\n", giver, Arrays.toString(product));
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }
}
