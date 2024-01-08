package be.nadira.lesson1.oopLesson2.office;

public class Security extends Person{

    public Security(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Security gets a salary of 15000");

    }

}
