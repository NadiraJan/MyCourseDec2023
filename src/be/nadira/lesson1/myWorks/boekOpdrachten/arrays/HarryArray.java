package be.nadira.lesson1.myWorks.boekOpdrachten.arrays;

public class HarryArray {
    public static void main(String[] args) {

        int [] array = {1, 2, 55, 99};


        System.out.println(HarryArray.isSorted(array));

    }

    public static boolean isSorted(int [] numbers){

        for(int i = 1; i < numbers.length; i++){

            if(numbers[i] < numbers[i - 1]){

                return false;
            }
        }
        return true;
    }
}
