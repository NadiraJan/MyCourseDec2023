package be.nadira.lesson1.theory;

public class WhileExample {
    public static void main(String[] args) {

        int count = 1;
        while(count < 100){

            System.out.println(count);
            count++;

        }
        System.out.println("while finished");

        while(true){
            count++;
            System.out.println(count);
            if(count == 1000){
                break;
            }

        }
        System.out.println("While 2 is finished");

    }
}
