package be.nadira.lesson1.theory;

public class BooleanLogic {
    public static void main(String[] args) {

        //Koop een brood

        boolean isBoughtBread = true;//can be also TRUE one of two
        boolean isBoughtMilk = true;

        //to combine these two operations bread & milk we use AND &&
        // (IF TWO OPER TRUE THAN TRUE, ELSE FALSE)
        boolean isBoughtMilkAndBread = isBoughtBread && isBoughtMilk;
        //boolean isBoughtMilkAndBread = true && true;
        // RESULT:  boolean isBoughtMilkAndBread = true; Success!

        if(isBoughtBread && isBoughtMilk){
            System.out.println("Success!");
        } else if(isBoughtMilk){
            System.out.println("Milk is bought");
        } else if(isBoughtBread){
            System.out.println("Bread is bought");
        }
        else {
            System.out.println("No milk, no bread");
        }

        //koop of brood of melk voor deze gebruiken we oper. OR ||, if at least one is true than true,
        //and if all false than FALSE
        boolean isBoughtMilkOrBread = true || true;
        //boolean isBoughtMilkOrBread = true;
        //boolean isBoughtMilkOrBread = true || false;
        //boolean isBoughtMilkOrBread = true ;
        //boolean isBoughtMilkOrBread = false || false;


        // Bought candy or Not
        boolean isBoughtCandy = false;

        if (!isBoughtCandy){   //if not false than Success!
            System.out.println("Success!");
        }
    }
}
