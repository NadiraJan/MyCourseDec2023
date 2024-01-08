package be.nadira.lesson1.oopLesson2.polymorphism.interfaces.tasks;

import jdk.swing.interop.SwingInterOpUtils;

public class Duck implements Flyable, Swimable{


    @Override
    public void fly() {
        System.out.println("Duck flies");
    }

    @Override
    public void swim() {
        System.out.println("Duck swims");
    }
}
