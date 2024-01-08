package be.nadira.lesson1.oopLesson2.polymorphism.interfaces.tasks;

public class Fish implements Swimable{


    @Override
    public void swim() {
        System.out.println("A fish swims");
    }
}
