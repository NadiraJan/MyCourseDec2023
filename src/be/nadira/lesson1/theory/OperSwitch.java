package be.nadira.lesson1.theory;

public class OperSwitch {
    public static void main(String[] args) {
        //1-Monday etc
        int numberDay = 11;

     /*   if(numberDay ==1){
            System.out.println("Monday"); etc.
        }*/

        switch (numberDay) {
          /*  case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

       default:
                System.out.println("Such day does not exist");
                break;
        }*/
            //more shorter in JAVA 17

            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Does not exist");

        }
    }
}