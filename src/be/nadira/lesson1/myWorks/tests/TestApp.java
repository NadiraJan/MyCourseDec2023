package be.nadira.lesson1.myWorks.tests;

import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {

 /* Scanner kbd = new Scanner(System.in);
        System.out.println(" enter your number from 1 to 5: ");
        int number = kbd.nextInt();
        if (number >=1 && number <=5 ) {
            System.out.println("your number is: " + number);


        } else {
            System.out.println("wrong number");
        }*/

      /*  int i=10, j=2;

    if (i <= 10) {

        j = j + 1;
        i--;
        System.out.println(j);

    } else {
        System.out.println(i);
    }*/

      /*  int getal = 100;
        if(getal>=100) {
            getal -= 10;

        }else {
            getal+=10;

        } if(getal < 80){
            getal*=30;

        } else {
            getal += 30;
        }
        System.out.println(getal);*/

        int i = 1, j = 6;
        while (true) {
            i++;
            --j;

            if (i >= 11) {
                j = j - 1;
                i++;
            } else {
                System.out.println("j = " + j);
                break;
            }


        }


    }}