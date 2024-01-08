package be.nadira.lesson1.theory;

import java.util.Arrays;

public class ForI {
    public static void main(String[] args) {

        // print first three elements of array

        int[] numbers = {1, 2, 3, 4};
        for(int i = 0; i< 3; i++){
            System.out.println(" zn - i: " + i);
            System.out.println(numbers[i]);

//condition returns TRUE Or False: i< 3;

        }

        //print out all even numbers from array
        System.out.println("________________________");
        int[] numbers2 = {3, 2, 10, 5, 8};
    for(int element : numbers2){
        if(element %2 ==0){

            System.out.println( element); // 2, 10, 8.
            }
        }
        System.out.println("___________________________");
    //PRINT out all elements under even indexes form array
        for(int i=0; i< numbers2.length; i++ ){
            if(i % 2 == 0){
                System.out.println(numbers2[i]); // 3, 10, 8 because: 3 is index0, 10 is index 2, 8 is index 4



        }


            }
        }
    }

