package be.nadira.lesson1.myWorks.boekOpdrachten.arrays;

import java.util.Arrays;
import java.util.NavigableMap;

public class Opdracht2 {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 15, 22, 35};
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));

        int key = 22;
        System.out.println(key + "found at index: " + Arrays.binarySearch(numbers, key));

        int[] biggerArray = Arrays.copyOf(numbers, 25);  // extend array adding extra rows
        System.out.println(Arrays.toString(biggerArray));

        int[] testScores = new int[25];
        Arrays.fill(testScores, 10);
        System.out.println("All test scores: " + Arrays.toString(testScores));


    }
}
