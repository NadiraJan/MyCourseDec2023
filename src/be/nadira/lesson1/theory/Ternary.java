package be.nadira.lesson1.theory;

public class Ternary {
    public static void main(String[] args) {

       int money = 100;
       int breadPrice = 20;
       int moneyAfterShopping = money-breadPrice;
  /*  int childMoney = moneyAfterShopping;

    if(moneyAfterShopping >=50){
           childMoney =10;
           moneyAfterShopping -=10;
       } else {
           childMoney = 5;
           moneyAfterShopping -= 5;
       }
        System.out.println(childMoney);
        System.out.println(moneyAfterShopping); }*/

        // IN SHORT ternary oper used:
 int childMoney = moneyAfterShopping >= 50 ? 10 : 5;
        moneyAfterShopping -= moneyAfterShopping >= 50 ? 10:5;
        System.out.println(childMoney);   //10
        System.out.println(moneyAfterShopping); // 70
    }
}
