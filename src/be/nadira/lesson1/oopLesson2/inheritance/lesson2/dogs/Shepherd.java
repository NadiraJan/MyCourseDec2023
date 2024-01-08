package be.nadira.lesson1.oopLesson2.inheritance.lesson2.dogs;

import be.nadira.lesson1.oopLesson2.inheritance.lesson2.defendedDog.Dog;

public class Shepherd extends Dog {


    public Shepherd() {
        super(27);
    }

    @Override
    public void run() {
        System.out.println("A shepherd runs quickly");
    }

    @Override
    public void breath() {
        System.out.println("Shepherd breathes perfect");
    }
@Override
public void bark(){
    System.out.println("Shepherd barks loud");
}


@Override
public void beAngry(){
        // shepherd has seen a stranger
    //became angry
    //calmed
    System.out.println("shepherd has seen a stranger");
    super.beAngry();
    System.out.println("calmed");

    System.out.println("A dog has: " + super.countLegs + ".");


}

}
