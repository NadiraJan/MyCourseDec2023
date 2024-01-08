package be.nadira.lesson1.oopLesson2.inheritance.lesson2.guide;

public class App {
    public static void main(String[] args) {

        Country france = Guide.FRANCE;
        Country argentina = Guide.ARGENTINA;
        Country italy = Guide.ITALY;

        System.out.println(france);
        System.out.println(argentina);
        System.out.println(italy);

        System.out.println(argentina.getContinent());

    }
}
