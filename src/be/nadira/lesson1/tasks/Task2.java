package be.nadira.lesson1.tasks;

public class Task2 {
    public static void main(String[] args) {

        //print out all even numbers from array
        System.out.println("________________________");
        int[] numbers2 = {3, 2, 10, 5, 8};
        for(int element : numbers2){
            if(element %2 ==0){

                System.out.println( element);
            }
        }
    }
}
