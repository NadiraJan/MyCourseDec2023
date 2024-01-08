package be.nadira.lesson1.oopLesson2.office;

public abstract class OfficeEmployer extends Person{

    public OfficeEmployer(boolean isMan){
        super(isMan);

    }

    public void drinkCoffee(){
        System.out.println("OfficeEmployer drinks coffee");
    }



}
