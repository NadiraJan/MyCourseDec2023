package be.nadira.lesson1.oopLesson2.office;

public abstract class Person {

    private boolean isMan;

    public Person(boolean isMan) {
        this.isMan = isMan;
    }

    public boolean isMan() {
        return isMan;
    }

    public abstract void  getSalary();
}

