package be.nadira.lesson1.oopLesson2;

import be.nadira.lesson1.oopLesson2.zoopark.Dog;
import be.nadira.lesson1.oopLesson2.zoopark.Zoo;

public class CatApp {
    public static void main(String[] args) {

     Dog dog = new Dog("White", 6, "Leo");

        Cat cat = new Cat("Black", 5, "Alex");
        Zoo zoo = new Zoo(cat, dog);
        zoo.feed();

    }


    }





