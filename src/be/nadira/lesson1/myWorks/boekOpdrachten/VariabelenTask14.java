package be.nadira.lesson1.myWorks.boekOpdrachten;

import java.util.Scanner;

public class VariabelenTask14 {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.println("Geef jouw bmi: ");

        int bmi = kbd.nextInt();

        if (bmi < 20) {
            System.out.println("Ondergewicht");

        } else {

            if (bmi >= 20 && bmi <= 25) {
                System.out.println("BMI IS OK");

            } else {
                if (bmi > 25 && bmi <= 30) {
                    System.out.println("Overgewicht");

                } else {
                    if (bmi > 30 && bmi <= 40) {
                        System.out.println("obesitas");

                    } else {
                        if (bmi > 40) {
                            System.out.println("ziekelijk overgewicht");
                        }
                    }
                }
            }

        }
    }
}



