package be.nadira.lesson1.theory;

public class ContinueCycle {
    public static void main(String[] args) {
        // range 1-5 do smthg
        // if 6 than do nothing
        int [] results = {2, 5, 6, 3, 1};
        for(int number : results){
            System.out.println(number);
            if(number == 6) {
                continue; // to miss an iteration

            }
            System.out.println("do something");




        }
    }
}
