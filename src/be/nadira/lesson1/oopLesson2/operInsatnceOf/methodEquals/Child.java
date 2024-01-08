package be.nadira.lesson1.oopLesson2.operInsatnceOf.methodEquals;

import java.util.Objects;

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
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Child  child2) {
            return this.getName().equals(child2.getName()) && this.getBirthYear() == child2.getBirthYear();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getBirthYear() % 2;
    }
}
