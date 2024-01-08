package be.nadira.lesson1.myWorks.boekOpdrachten;

import java.util.Random;
import java.util.Scanner;

public class RandomLotoTest {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        Random random = new Random();
        int guessedNumber = random.nextInt(20);
        boolean isGuessed = true;

        while (isGuessed) {
            System.out.println("Enter your guessed number: ");
            int yourGuessedNumber = kbd.nextInt();

            if (yourGuessedNumber < guessedNumber) {
                System.out.println("Higher");

            } else {
                if (yourGuessedNumber > guessedNumber) {
                    System.out.println("Lower");
                } else {
                    System.out.println("You won!!!");
                    isGuessed = false;

                }
            }
        }
        System.out.println("You won the game");


    }
}
