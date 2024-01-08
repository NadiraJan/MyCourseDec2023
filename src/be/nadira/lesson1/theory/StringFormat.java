package be.nadira.lesson1.theory;

public class StringFormat {
    public static void main(String[] args) {

        String name = "Alex";
        int age = 30;

     /*   String phrase = "My name is " +  name+". I'm " + age + " years old.";
        System.out.println(phrase);*/

       // Special method
       String phrase = String.format("My name is %s. I'm %d years old. ", name, age);
       // %s means STRING because Alex ; %d decimal(digit) because 30 years
        System.out.println(phrase);

        // Most correct option to print a phrase:
        System.out.printf("My name is %s. I'm %d years old. ", name, age);

        //see all format specifiers in https://www.javatpoint.com/java-string-format

    }
}
