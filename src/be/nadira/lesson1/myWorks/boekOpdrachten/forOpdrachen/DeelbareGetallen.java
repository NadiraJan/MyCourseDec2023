package be.nadira.lesson1.myWorks.boekOpdrachten.forOpdrachen;

public class DeelbareGetallen {

    public static void main(String[] args) {

        int number = 0;
        for(; number <= 1000; number++){

            if(number % 6 ==0 && number % 28 == 0){
                System.out.println(number);
            }

        }
    }
}
