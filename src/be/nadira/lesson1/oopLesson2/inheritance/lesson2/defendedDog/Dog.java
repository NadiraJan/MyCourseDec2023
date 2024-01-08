package be.nadira.lesson1.oopLesson2.inheritance.lesson2.defendedDog;

import be.nadira.lesson1.oopLesson2.inheritance.lesson2.Alive;

public abstract class Dog extends Alive {

   protected final int countLegs = 4;
    public int countTeeth;

    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }

    public void bark() {
        System.out.println("A dog barks");

    }

    public abstract void run();


    public void beAngry() {
        System.out.println("A dog became angry");
    }

    public final void eat(){
        System.out.println("A dog eats");
    }

}