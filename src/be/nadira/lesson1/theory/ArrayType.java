package be.nadira.lesson1.theory;

import java.util.Arrays;

public class ArrayType {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        //Initializing of Array
/*    int[] array = new int[2];
    array[0] = x;
    array[1] = y;*/

        //    int [] array = new int[]{x,y};
        int[] array = {x, y};
        System.out.println(Arrays.toString(array));

        System.out.println(array[1]);
//int[] array2 = array;
//array2[0] = 13;
        //System.out.println(Arrays.toString(array));//  [13, 10]
        // System.out.println(Arrays.toString(array2));// [13, 10] because reference to the same }
        //object array; to create different element of Array2, need to create new array:

        int[] array2 = new int[2];
        array2[0] = array[0];
        array2[1] = array[1];
        array2[0] = 13;
        System.out.println(Arrays.toString(array));//  [13, 10] //[5, 10]
        System.out.println(Arrays.toString(array2));// [13, 10] //[13, 10]
        //two different objects are created


        int[] numbers = {2, 3, 5, 8};
        for (int index : numbers){
            System.out.println(index);
        }
    }
}