package be.nadira.lesson1.oopLesson2.inheritance.lesson2.dogs;

import be.nadira.lesson1.oopLesson2.inheritance.lesson2.defendedDog.Dog;

public class Poodle extends Dog {

    public Poodle(){
        super(28);

    }


    @Override
    public void run() {
        System.out.println("poodle runs slowly");
    }

    @Override
    public void breath() {
        System.out.println("Poodle breathes good");
    }
}
