package be.nadira.lesson1.oopLesson2.polymorphism.interfaces.dependency_inversion;

public class App {
    public static void main(String[] args) {

        Poodle poodle = new Poodle();
        Shepherd shepherd = new Shepherd();
        Terier terier = new Terier();

        DogGarden dogGarden1 = new DogGarden(shepherd, terier);
        DogGarden dogGarden = new DogGarden(poodle, shepherd);



    }
}
