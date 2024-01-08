package be.nadira.lesson1.myWorks.boekOpdrachten;

import java.util.Random;

public class RandomApp_task1 {
    public static void main(String[] args) {

        Random random = new Random();

        for(int i = 0; i < 6; i++){
            System.out.println(random.nextInt(46));
        }



        }

    }


