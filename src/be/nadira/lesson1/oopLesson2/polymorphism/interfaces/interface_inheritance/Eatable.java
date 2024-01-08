package be.nadira.lesson1.oopLesson2.polymorphism.interfaces.interface_inheritance;

public interface Eatable {

    default void eat(){
        System.out.println("Object eats");

    };

}
