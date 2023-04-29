package com.javacourse.loiane.lesson24.review;

public class BookstoreBookTest {

    public static void main(String[] args) {

        BookstoreBook bookstoreBook = new BookstoreBook();

        bookstoreBook.title = "Mastering ExtJS";
        bookstoreBook.author = "Loiane Groner";
        bookstoreBook.qtPages = 200;
        bookstoreBook.yearPublished = 2015;
        bookstoreBook.price = 63.39;

        System.out.println("Title: " + bookstoreBook.title);
        System.out.println("Author: " + bookstoreBook.author);
        System.out.println("Pages: " + bookstoreBook.qtPages);
        System.out.println("Year Published: " + bookstoreBook.yearPublished);
        System.out.println("Price: " + bookstoreBook.price);
    }
}
