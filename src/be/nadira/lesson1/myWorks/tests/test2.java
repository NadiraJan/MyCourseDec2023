package be.nadira.lesson1.myWorks.tests;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        int day;
        boolean casualFriday = false;
        String stringDay = "";
        String dayType = "";

        Scanner kbd = new Scanner(System.in);

        do {
            System.out.println("Enter your day [1-7]: ");
            day = kbd.nextInt();

            switch (day) {

                case 1:
                    stringDay = "Monday";
                    break;

                case 2:
                    stringDay = "Tuesday";
                    break;

                case 3:
                    stringDay = "Wednesday";
                    break;

                case 4:
                    stringDay = "Thursday";
                    break;

                case 5:
                    stringDay = "Friday";
                    casualFriday = true;
                    break;

                case 6:
                    stringDay = "Saturday";
                    break;

                case 7:
                    stringDay = "Sunday";
                    break;

                default:
                    System.out.println("INVALID DAY!!!");

            }
                    switch (day) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            if (casualFriday) {
                                System.out.println("Casually closed!!!");

                                }
                            dayType = "WeekDay";   break;


                        case 6:
                        case 7:
                            dayType = "Weekend";
                            break;
                    }

        } while (day < 1 || day > 7);
            System.out.println(stringDay + " is a: " + dayType);

    }
}