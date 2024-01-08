package be.nadira.lesson1.theory;

import java.util.Arrays;

public class MyString {
    public static void main(String[] args) {

        String text = new String("hey");
        String text2 = new String("hey");
        System.out.println(text.equals(text2));
        System.out.println("_________________");


        String text3 = "Hello world!";
        //Capital letters
        String textUpper = text3.toUpperCase();
        System.out.println(textUpper); //HELLO WORLD!

        // LowCase
        String textLower = text3.toLowerCase();
        System.out.println(textLower); // hello world!

        // String length
        int length = text3.length();
        System.out.println(length); //12

        //Contains the text another text?
        boolean containsHello = text3.contains("hello");
        System.out.println(containsHello); // false because h instead of H

        //replacing all parts of text to other texts for ex. all "l" to "a"
        String replacedText = text3.replaceAll("l", "a");
        System.out.println(replacedText);

        //repeat text n-times

        String repeatedText = text3.repeat(5);
        System.out.println(repeatedText);

        //divide text to array String
        String names = "Alex; Elvis; valya";
        String[] namesArray = names.split(";");
        System.out.println(Arrays.toString(namesArray));//[Alex,  Elvis,  valya]

        //concatenation of strings
        String word1 = "hi";
        String word2 = "friend";
        String result = word1 + word2;
        System.out.println(result); //hifriend

        //end with subString
        boolean endsWithWorld = text3.endsWith("world!");
        System.out.println(endsWithWorld);// true

        //String cutting (first 5 symbols)
        String firstFiveLetters = text3.substring(0, 5);
        System.out.println(firstFiveLetters);// Hello

        String lenghtText3 = "hello".replaceAll("l", "a").toUpperCase();
        System.out.println(lenghtText3);//HEAAO







    }
}
