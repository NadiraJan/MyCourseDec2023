package be.nadira.lesson1.myWorks.boekOpdrachten.stringOpdrachten;

public class VergelijkinAlphabetisch {
    public static void main(String[] args) {

        String world = "Hello World";
        String mars = "Hello Mars";

        if(world.compareTo(mars) < 0){
            System.out.println(world);
            System.out.println(mars);
        } else {
            System.out.println(mars);
            System.out.println(world);
        }

    }
}
