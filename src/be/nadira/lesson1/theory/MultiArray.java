package be.nadira.lesson1.theory;

public class MultiArray {
    public static void main(String[] args) {

        //The shop is robbed. A thief was 178 tall
        //Police found two groups of people.
        //find a thief by height (178)

        int[] group1 = {180, 178, 190};
        int[] group2 = {165, 188, 195};

        //need to create an array for these two arrays

        int[][] multiArray = {group1, group2};

        upperFor:
        for (int[] array : multiArray) {
            for (int number : array) {
                if (number == 178) {
                    System.out.println("a thief found");
                    break upperFor;

                } else {
                    System.out.println("No matches by height");
                }
            }
        }
    }
}
