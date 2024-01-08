package be.nadira.lesson1.myWorks.boekOpdrachten.forOpdrachen;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("eNTER YOU NUMBER");
        int number = kbd.nextInt();

        if(isPalindrom(number)){
            System.out.println("Is Palindrom");
        } else {
            System.out.println("Not Palindrom");

        }
        kbd.close();
    }
    private static boolean isPalindrom(int number){
       int temp = number;
        int remainder;
        int reverse = 0;

                while(temp > 0){
                    remainder = temp % 10;
                    temp /= 10;
                    reverse = (reverse * 10)+ remainder;
                }

                return reverse == number;
    }
}
