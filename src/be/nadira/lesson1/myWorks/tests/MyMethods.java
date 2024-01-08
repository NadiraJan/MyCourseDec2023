package be.nadira.lesson1.myWorks.tests;

import java.util.Scanner;

public class MyMethods {
    public static void main(String[] args) {

       greeting();

       person("Kamilla");
       person("Argen");

    }

    public static void greeting(){
        System.out.println("Hello");

    }

    public static void person(String name){
        System.out.println("Hello " + name);
    }

}
