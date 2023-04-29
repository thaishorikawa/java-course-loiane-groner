package com.javacourse.loiane.lesson24.review;

import java.util.Date;

public class LibraryBookTest {

    public static void main(String[] args) {

        LibraryBook libraryBook = new LibraryBook();

        libraryBook.title = "Mastering ExtJS";
        libraryBook.author = "Loiane Groner";
        libraryBook.qtPages = 200;
        libraryBook.yearPublished = 2015;

        libraryBook.checkedOut = true;
        libraryBook.dueDate = new Date();
        libraryBook.checkedOutWhom = "Thais";

        System.out.println("Title: " + libraryBook.title);
        System.out.println("Author: " + libraryBook.author);
        System.out.println("Pages: " + libraryBook.qtPages);
        System.out.println("Year Published: " + libraryBook.yearPublished);

        System.out.println("Checked out: " + libraryBook.checkedOut);
        System.out.println("Due date: " + libraryBook.dueDate);
        System.out.println("Checked out to whom: " + libraryBook.checkedOutWhom);

    }
}
