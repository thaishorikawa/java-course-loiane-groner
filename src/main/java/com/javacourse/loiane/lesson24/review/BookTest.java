package com.javacourse.loiane.lesson24.review;

public class BookTest {

    public static void main(String[] args) {

        Book book = new Book();

        book.title = "Mastering ExtJS";
        book.author = "Loiane Groner";
        book.qtPages = 200;
        book.yearPublished = 2015;

        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Pages: " + book.qtPages);
        System.out.println("Year Published: " + book.yearPublished);

    }
}
