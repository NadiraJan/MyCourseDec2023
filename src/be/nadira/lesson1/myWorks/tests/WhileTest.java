package be.nadira.lesson1.myWorks.tests;

import java.util.Random;
import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {

       /* int x = 1;

        while(x <= 100){

            if(x % 2 == 0){ // even getal 0 is remainder 0

                System.out.println(x);
            }

            x++;


        }*/
        System.out.println("This will be printed after the while");

        Scanner kbd = new Scanner(System.in);
        Random random = new Random();
        boolean isGuessing = true;
        int guessedNumber = random.nextInt(100);

        while (isGuessing) {

            System.out.println("enter your number: ");
            int number = kbd.nextInt();

            if (number < guessedNumber) {
                System.out.println("Higher");
            } else {
                if (number > guessedNumber) {
                    System.out.println("Lower");

                } else {
                    System.out.println("Guessed!!!");
                    isGuessing = false;
                }
            }

        }
        System.out.println("You won the game!!!");
    }
}
