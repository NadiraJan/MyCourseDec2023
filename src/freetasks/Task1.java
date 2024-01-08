package freetasks;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task1 {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = kbd.nextDouble();

        System.out.println("Enter b: ");
        double b = kbd.nextDouble();

        System.out.println("Enter c: ");
        double c = kbd.nextDouble();

        double D = b * b - 4 * a * c;

        if (D > 0) {
            double x1, x2;
            x1 = (-b - sqrt(D)) / (2 * a);
            x2 = (-b + sqrt(D)) / (2 * a);
            System.out.println("the roots x1 : " + x1);
            System.out.println("the roots x2 : " + x2);

        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Only one root x: " + x);

        } else {
            System.out.println("Unfortunately no roots!");
        }
    }

}
