package be.nadira.lesson1.oopLesson2.inheritance.lesson2;

import be.nadira.lesson1.oopLesson2.inheritance.lesson2.dogs.Poodle;
import be.nadira.lesson1.oopLesson2.inheritance.lesson2.dogs.Shepherd;

public class App {
    public static void main(String[] args) {


        Poodle poodle = new Poodle();
        poodle.bark();
        poodle.run();
        poodle.breath();
        System.out.println("Teeth: " + poodle.countTeeth);

        Shepherd shepherd = new Shepherd();
        shepherd.bark();
        shepherd.run();
        shepherd.breath();
        System.out.println("Teeth: " + shepherd.countTeeth);
        shepherd.beAngry();
        System.out.println();
        shepherd.eat();


    }
}
