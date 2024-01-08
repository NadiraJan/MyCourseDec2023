package be.nadira.lesson1.oopLesson2;

public class Recursion {
    // count the sum of all numbers from 1 to k

    public int sum(int number){

        if(number < 1){
            return 0;
        }
            //int result = number + number - 1 + number - 2 ... number > 0
        int result = number + sum(number - 1);
        return result;
    }
    // number = 10-> result = 10 + sum(10-1)
    // number = 9-> result = 9 + sum(9-1)
    // ...
    // number = 2-> result = 2 + 1
    // number - 1 -> result = 1 + 0
    // number = 0 -> return 0



}
