package be.nadira.lesson1.myWorks.boekOpdrachten.arrays;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        String S = "azABaabza";

        String s = S.substring(2, 7);
        System.out.println(s);
        System.out.println(s.length());


        int a[] = {1, 0, 1, 0, 1, 1};
        for (int i = 0; i < a.length/2; i++) {

            a[5] = a[a.length-(1+i)];

        }
        System.out.println(Arrays.toString(a));

        int[] b = {1, 1, 0, 1, 1};
        for(int i = 0; i < b.length; i++){



        }
        System.out.println(Arrays.toString(b));
    }






}
