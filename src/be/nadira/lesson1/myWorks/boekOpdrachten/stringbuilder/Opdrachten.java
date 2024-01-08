package be.nadira.lesson1.myWorks.boekOpdrachten.stringbuilder;

public class Opdrachten {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("This is my text");
        StringBuilder sb2 = new StringBuilder("This @@is the second text");

        System.out.println(sb1);
        System.out.println(sb2);

        //Voeg aan de eerste sb een stukje tekst toe.
        sb1.append("  Ik voeg een text toe");
        System.out.println(sb1);//This is my text  Ik voeg een text toe


        // Keer de tekens van de tweede sb om , omgekeerde sb2
 //   sb2.reverse();
    //    System.out.println(sb2); // txet dnoces eht si sihT

        //Verwijder alle spaties uit de eerste sb
       for(int i = 0; i< sb2.length(); i++){
           if(sb2.charAt(i) == ' '){
               sb2.deleteCharAt(i);
           }
       }
        System.out.println(sb2); //txetdnocesehtsisihT of txetdnocesehtsi@@sihT voor alle symbols

        //Verdubbel ieder letter 't' in de tweede sb

    for(int i = 0; i < sb2.length(); i++){
        if(sb2.charAt(i) == 't'){
            sb2.insert(i++, 't'); //This@@istthesecondttextt

//sb2.insert(i++ om naar de laatste character te springen!!!
            }
        }
        System.out.println(sb2);

    }
}
