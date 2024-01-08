package be.nadira.lesson1.oopLesson2.book;

public class BookApp {
    public static void main(String[] args) {

        Book book = new Book("Stories", "Twain",80,false);
        System.out.println(book);

       book.printCountRows(); //3200

        book.printCountRows(38);

        book.printInfo();

    }
}
