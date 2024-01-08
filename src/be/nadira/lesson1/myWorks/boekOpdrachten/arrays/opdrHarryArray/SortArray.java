package be.nadira.lesson1.myWorks.boekOpdrachten.arrays.opdrHarryArray;

public class SortArray {
   //sorting array with int argument

    public static boolean isSorted(int[] numbers, boolean ascending){

        for(int i = 1; i < numbers.length; i++){

            //if(numbers[i] <  numbers[i-1]){
            if(ascending && numbers[i - 1] > numbers[i] || !ascending && numbers[i-1] < numbers[i]){

                return false;


            }
        }

        return true;

    }




}
