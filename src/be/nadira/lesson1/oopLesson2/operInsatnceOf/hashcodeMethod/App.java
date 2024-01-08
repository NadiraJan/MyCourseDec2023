package be.nadira.lesson1.oopLesson2.operInsatnceOf.hashcodeMethod;

import be.nadira.lesson1.oopLesson2.operInsatnceOf.methodEquals.Child;

public class App {
    public static void main(String[] args) {

        Child child1 = new Child("James Alex", 2009);
        Child child2 = new Child("Laslie Jan", 2009);
        Child child3 = new Child("Bart Smith", 2010);
        Child child4 = new Child("Anneke Puts", 2010);

        Child[]group0 = {child1, child2};
        Child[]group1 = {child3, child4};
        Child[][] children = {group0, group1};
        ChildrenGardenWIthGroups childrenGardenWIthGroups = new ChildrenGardenWIthGroups();

        System.out.println(child3.hashCode());



    }

}
