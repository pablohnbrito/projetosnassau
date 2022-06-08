package PooProject2VA;

import java.util.Scanner;

public class Book {
    private String bookName;
    private int year;
    private String author;
    private int bookId;
    private static int sequence = 0;


    public Book(String bookName, int year, String author) {
        this.bookId = sequence++;
        this.bookName = bookName;
        this.year = year;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
