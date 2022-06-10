package PooProject2VA;

import java.util.Scanner;

public class Book {
    private String bookName;
    private int year;
    private String author;
    private int bookId;

    private boolean onLoan;


    public Book(String bookName, int year, String author, Boolean onLoa, int bookId) {
        this.bookName = bookName;
        this.year = year;
        this.author = author;
        this.onLoan = onLoan;
        this.bookId = bookId;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
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

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                ", bookId=" + bookId +
                ", onLoan=" + onLoan +
                '}';
    }
}
