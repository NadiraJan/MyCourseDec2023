package be.nadira.lesson1.oopLesson2.office;

public class Accountant extends OfficeEmployer{

    public Accountant(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Accountant gets 50000");
    }
}
