package be.nadira.lesson1.myWorks.tests;

public class MyForLoop {
    public static void main(String[] args) {
//andere optie voor FOR loop:
     /*   int i = 0;
        int test = 0;
        for(; i<=10; test = i - 5){
            System.out.println(i++);
            System.out.println("test" + test);
        }*/

int  i = 0;
        for(;;){
            System.out.println(i);
            if(i == 10){
                System.out.println("Breaking the loop");
                break;
            }
            i++;
        }



    }
}
