package be.nadira.lesson1.oopLesson2.polymorphism.interfaces.basics;

public class App {
    public static void main(String[] args) {
        Movable car = new Car();
        Movable dog = new Dog();


        Movable[] movables = new Movable[2];
        movables[0] = car;
        movables[1] = dog;
        for(Movable movable:movables){
            movable.move();
        }



    }
}
