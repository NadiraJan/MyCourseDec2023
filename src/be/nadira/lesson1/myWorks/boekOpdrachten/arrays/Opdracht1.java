package be.nadira.lesson1.myWorks.boekOpdrachten.arrays;

import java.util.Arrays;

public class Opdracht1 {
    public static void main(String[] args) {

        int [] array = new int [20];

        for(int i = 0, j = 1; i < array.length; i++){
            array[i] = j++ * 7;
        }

        System.out.println(Arrays.toString(array));


    }
}
