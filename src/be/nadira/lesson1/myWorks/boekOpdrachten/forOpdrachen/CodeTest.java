package be.nadira.lesson1.myWorks.boekOpdrachten.forOpdrachen;

import java.util.Scanner;

public class CodeTest {
    public static void main(String[] args) {

        String p1 ="* * * * * * ==================================\n * * * * *  ==================================";
        String p2 ="==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }
}
