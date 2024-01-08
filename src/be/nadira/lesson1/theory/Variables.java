package be.nadira.lesson1.theory;

public class Variables {
    public static void main(String[] args) {

       //byte
        byte maxByte = 127;
        byte minByte = -128;

        //short sostoit iz 2 bite ili iz 16 bits
        short maxShort = 32_767;
        short minShort = -32_768;

        //integer sostoit iz 4bytes or 32bits

        int maxInteger = 2_147_483_647;
        int minInteger = -2_147_483_648;

        //Long - int number, sostoit iz 8 bytes or 64bits

        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = - 9_223_372_036_854_775_808L;

        //Double 64bits
        double myBottle = 1.5;

        //Float 32bits
        float cola = 0.33F;

        double doubleNumber = 1.12345678901234567890;
        float floatNumber = 1.12345678901234567890F;

        System.out.println(doubleNumber); // 1.1234567890123457 //not printed 7890
        System.out.println(floatNumber); //1.1234568

       //Char - 16 bits
        char letter = 70;
     //   System.out.println(letter);

        char newLine = '\n'; // novaya stroka
        System.out.print("a");
        System.out.print(newLine);
        System.out.print("b");

        char tab = '\t';  //tabulatie
        char escape = '\\'; //slash
        System.out.println(escape);


    }
}
