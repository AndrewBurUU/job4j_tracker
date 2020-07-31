package ru.job4j.pojo;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        Book fairytale = new Book("Alice in Wonderland", 130);
        Book javafirst = new Book("Java first", 300);
        Book sfiction = new Book("451 F", 200);
        Book cleancode = new Book("Clean code", 100);
        Book[] books = new Book[4];
        books[0] = fairytale;
        books[1] = javafirst;
        books[2] = sfiction;
        books[3] = cleancode;
        Book tmpBook = books[0];
        for (int index = 0; index < books.length; index++) {
            tmpBook = books[index];
            System.out.println(tmpBook.getName() + ": " + tmpBook.getCount());
        }
        System.out.println("");
        System.out.println("Replace book0 with book3");
        tmpBook = books[0];
        books[0] = books[3];
        books[3] = tmpBook;
        for (int index = 0; index < books.length; index++) {
            tmpBook = books[index];
            System.out.println(tmpBook.getName() + ": " + tmpBook.getCount());
        }
        System.out.println("");
        System.out.println("Only Clean code book");
        for (int index = 0; index < books.length; index++) {
            tmpBook = books[index];
            if (tmpBook.getName().equals("Clean code")) {
                System.out.println(tmpBook.getName() + ": " + tmpBook.getCount());
            }
        }

    }
}
