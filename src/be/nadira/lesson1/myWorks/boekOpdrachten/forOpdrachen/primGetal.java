package be.nadira.lesson1.myWorks.boekOpdrachten.forOpdrachen;

public class primGetal {
    public static void main(String[] args) {

        int number = 1000;
        boolean isPrime = true;

        for (int Prime = 2; Prime <= number; Prime++) {
            for (int i = 2; i < Prime; i++) {
                if (Prime % i == 0) {
                   isPrime = false;
                    break;
                }
            }

            if (isPrime) System.out.println(Prime);
            else isPrime = true;

        }
    }
}