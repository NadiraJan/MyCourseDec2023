package be.nadira.lesson1.myWorks.boekOpdrachten.arrays;

import java.util.Arrays;

public class Opdr1 {
    public static void main(String[] args) {

     int [][] array = new int[4][6];
     for(int i = 0; i < array.length; i++){
         for(int j = 0; j < array[i].length; j++) {

             array[i][j] = i+j;

         }
     }

     for(int[] row : array){
         for(int el: row){
             System.out.printf("%5d", el);
         }
         System.out.println();
     }

        System.out.println(Arrays.toString(array));
    }
}
