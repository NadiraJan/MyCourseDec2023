package be.nadira.lesson1.myWorks.boekOpdrachten.arrays.opdrHarryArray;

public class SortInt {
    public static int[] sort(int[]numbers, boolean ascending){

        for(int gap = numbers.length / 2; gap>0; gap/=2){

            for(int i = gap; i< numbers.length; i++){

                insertion(numbers, ascending, gap, i);
            }
        }




        return numbers;
    }
    public static void insertion(int[] numbers, boolean ascending, int gap, int start){

        int temp = numbers[start];
        for (; start >= gap; start -= gap){
            if(ascending && numbers[start - gap] < temp || !ascending && numbers[start - gap]> temp){
                break;
            }
            numbers[start] = numbers[start - gap];
        }

        numbers[start] = temp;


    }
}
