package be.nadira.lesson1.oopLesson2.book;

public class Book {

    String bookName;
    String author;
    int pages;
    boolean isNonFiction;

    public Book(String bookName, String author, int pages, boolean isNonFiction) {
        this.bookName = bookName;
        this.author = author;
        this.pages = pages;
        this.isNonFiction = isNonFiction;
    }

    public void printCountRows(){
        System.out.println("Number of rows: " + this.pages * 40);
    }

    public  void printCountRows(int countRowsOnPage){
        System.out.println("Number of rows: " + this.pages * countRowsOnPage);
    }

    public void printInfo(){
        System.out.printf("%s of %s - %s\n", this.bookName, this.author, this.isNonFiction ? "NonFiction" : "Fiction");
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", isNonFiction=" + isNonFiction +
                '}';
    }
}
