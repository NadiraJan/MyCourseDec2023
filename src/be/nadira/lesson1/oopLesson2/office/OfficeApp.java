package be.nadira.lesson1.oopLesson2.office;

public class OfficeApp {
    public static void main(String[] args) {

        Security security = new Security(true);
        Secretary secretary = new Secretary(false);
        Accountant accountant = new Accountant(false);

        security.getSalary();
        secretary.getSalary();
        accountant.getSalary();
        secretary.drinkCoffee();
    }
}
