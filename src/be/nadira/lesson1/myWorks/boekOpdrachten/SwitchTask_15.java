package be.nadira.lesson1.myWorks.boekOpdrachten;

import java.util.Scanner;

public class SwitchTask_15 {
    public static void main(String[] args) {

        int month;
        int days = 0;
        int year = 2023;
        String nameMonth = " ";

        Scanner kbd = new Scanner(System.in);
        System.out.println("enter month: ");
        month = kbd.nextInt();

        switch (month) {
            case 1:
                nameMonth = "January";
                break;

            case 2:
                nameMonth = "February";
                break;

            case 3:
                nameMonth = "March";
                break;

            case 4:
                nameMonth = "April";
                break;

            case 5:
                nameMonth = "May";
                break;

            case 6:
                nameMonth = "June";
                break;

            case 7:
                nameMonth = "July";
                break;

            case 8:
                nameMonth = "August";
                break;

            case 9:
                nameMonth = "September";
                break;

            case 10:
                nameMonth = "October";
                break;

            case 11:
                nameMonth = "November";
                break;

            case 12:
                nameMonth = "December";
                break;

            default:
                System.out.println("Invalid");

        }

        days = switch (month) {

            case 2 -> (year % 4 == 0) ? 29 : 28;

            case 4, 6, 9, 11 -> 30;

            case 1, 3, 5, 7, 8, 10, 12 -> 31;

            default -> 0;
        };

        System.out.println("Month is: " + nameMonth + " and days are: " + days);
    }

}
