package be.nadira.lesson1.oopLesson2.polymorphism.interfaces.tasks;

public class App {
    public static void main(String[] args) {

        Duck duck = new Duck();
        Fish fish = new Fish();
        Airplane airplane = new Airplane();

        Swimable[] swimpool = {fish, duck};
        Flyable[] flyables = {duck, airplane};

        for (Swimable swimable : swimpool) {
            swimable.swim();
        }
       for (Flyable flyable : flyables) {
            flyable.fly();
        }
    }
}
