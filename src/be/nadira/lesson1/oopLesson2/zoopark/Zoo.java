package be.nadira.lesson1.oopLesson2.zoopark;

import be.nadira.lesson1.oopLesson2.Cat;

public class Zoo {   //Dependency Injection когда в экземпляр класса вставляются объекты других классов
    // и у вставленных объектов вызываются какие-то методы
    private Cat cat;
    private Dog dog;

    public Zoo(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }
    public void feed(){
        cat.feed("Leo", "Fish");
        dog.feed("Alex", "Meat");

    }
}
