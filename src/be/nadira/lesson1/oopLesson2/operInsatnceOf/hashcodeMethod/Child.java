package be.nadira.lesson1.oopLesson2.operInsatnceOf.hashcodeMethod;

public class Child {
    private String name;
    private int birthYear;

    public Child(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public int hashCode(){
        return this.getBirthYear() % 2;

    }
}
