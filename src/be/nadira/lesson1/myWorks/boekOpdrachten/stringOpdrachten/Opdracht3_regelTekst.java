package be.nadira.lesson1.myWorks.boekOpdrachten.stringOpdrachten;

public class Opdracht3_regelTekst {
    public static void main(String[] args) {

        String letter = "Bakytbek";
        System.out.println(letter + ". "+ " De lengte van de text is: " + letter.length());
        System.out.println("____________________________");

        System.out.println(letter.toLowerCase());
        System.out.println("_____________________________");
        System.out.println(letter.toUpperCase());
        System.out.println("_____________________________");

        // vervang alle 'a' door de letter 'o'
        String newLetter = letter.replace( 'a', 'o');
        System.out.println(newLetter);

        String letter1 = "Bakytbek3";
        boolean check1 = letter.equals(letter1);
        System.out.println(check1); //false

        String letter5 = "Bakytbek3";
        boolean checking = letter1.equals(letter5);
        System.out.println(checking );

        String letter6 = new String("Bakytbek3");

        System.out.println(letter5.equals(letter6));
        System.out.println((letter5 == letter6));//false









    }
}
