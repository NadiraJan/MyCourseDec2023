package be.nadira.lesson1.myWorks.tests;

public class testMethodApp {
    public static void main(String[] args) {

        double number1 = 5.2;
        double number2 = 3.2;

        double result = testMethod.addition(number1, number2);
        testMethod.printResult(result);

        result = testMethod.substruction(number1, number2);
        testMethod.printResult(result);

        result = testMethod.multiplication(number1, number2);
        testMethod.printResult(result);

        result = testMethod.division(number1, number2);
        testMethod.printResult(result);


    }
}
