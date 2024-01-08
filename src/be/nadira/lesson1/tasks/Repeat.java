package be.nadira.lesson1.tasks;

import java.util.Arrays;

public class Repeat {
    public static void main(String[] args) {

      int array[] = {2,3,4};
        System.out.println(Arrays.toString(array));

//  int array2[] = array;
      //  System.out.println(Arrays.toString(array2));

        int array2[] = new int [3];
        array2[0]= array[0];
        array2[2] = array[2];
        array2[1] = array[1];
        array2[2] = 122;
        System.out.println(Arrays.toString(array2));

    }
}
