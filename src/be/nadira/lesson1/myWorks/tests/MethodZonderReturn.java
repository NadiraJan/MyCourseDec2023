package be.nadira.lesson1.myWorks.tests;

import java.util.Scanner;

public class MethodZonderReturn {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        final String ASK_INPUT = "Fill in your number, please: ";

        System.out.println(ASK_INPUT);
        int firstNumber = kbd.nextInt();
        System.out.println("The firstNumber is: " + firstNumber);

        System.out.println("___________________________");

        System.out.println(ASK_INPUT);
        int secondNumber = kbd.nextInt();
        System.out.println("The secondNumber is: " + secondNumber);

        System.out.println("___________________________");

        int lowestNumber = lowestValue(firstNumber, secondNumber);
        System.out.println("The lowestNumber is: " + lowestNumber);
    }

    public static int lowestValue(int number1, int number2) {
        //return (number1 > number2) ? number2 : number1;
      return Math.min(number1, number2);
    }
}
