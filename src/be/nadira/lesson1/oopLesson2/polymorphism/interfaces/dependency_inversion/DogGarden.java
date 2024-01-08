package be.nadira.lesson1.oopLesson2.polymorphism.interfaces.dependency_inversion;

public class DogGarden {

    private Dog dog1;
    private Dog dog2;


    public DogGarden(Dog dog1, Dog dog2) {
        System.out.println("constructor for any dog");
        this.dog1 = dog1;
        this.dog2 = dog2;
    }


    public DogGarden(Poodle poodle, Shepherd shepherd) {
        System.out.println("Constructor for Poodle & Shepherd");
        this.dog1 = poodle;
        this.dog2 = shepherd;
    }
}
