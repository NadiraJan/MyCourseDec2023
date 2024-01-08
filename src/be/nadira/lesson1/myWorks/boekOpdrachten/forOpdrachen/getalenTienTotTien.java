package be.nadira.lesson1.myWorks.boekOpdrachten.forOpdrachen;

public class getalenTienTotTien {
    public static void main(String[] args) {

        int number = -10;

      for(; number <= 10; number++) {
         if (number != 0 && number > 0) {
              System.out.println("+" + number);
          } else {
              if (number < 0 || number == 0) {
                  System.out.println(number);
              }
          }

      }
    }
}




