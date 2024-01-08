package be.nadira.lesson1.myWorks.boekOpdrachten;

import java.util.Scanner;

public class WhileOpdr16_last {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

   while (true) {

            System.out.println("Enter your number [1-10]: ");
            int number = kbd.nextInt();

            if (number<=10) {
                System.out.println("Correct number: " + number);
                break;

            }

            else {
                System.out.println("Wrong number, try again");
            }

        }

            /* System.out.println("Enter your number: ");
        int number = kbd.nextInt();
        if(number > 10){
            System.out.println("wrong number");
        } while (true){
            System.out.println("try again");
            number = kbd.nextInt();
            System.out.println(number);
            break;


        }*/
    }
}
