package be.nadira.lesson1.myWorks.boekOpdrachten.stringOpdrachten;

import java.util.Scanner;

public class AantalLetters {
    public static void main(String[] args) {
        //met for loop

        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter your text, please: ");
        String text = kbd.nextLine();

        int count  = 0;
        char searchValue = 'e';
        for(int i = 0 ; i < text.length(); i++){
            if(text.charAt(i) == searchValue){
                count++;
            }
        }
        System.out.println("Search value found: " + count + " times");

    }
}
