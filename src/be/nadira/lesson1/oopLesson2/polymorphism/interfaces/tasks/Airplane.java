package be.nadira.lesson1.oopLesson2.polymorphism.interfaces.tasks;

import jdk.swing.interop.SwingInterOpUtils;

public class Airplane implements Flyable{


    @Override
    public void fly() {
        System.out.println("Airplane flying");
    }
}
