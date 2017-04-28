package edu.jamashie;

import java.awt.print.Book;

/**
 * Created by bampk on 4/26/2017.
 */
public class BookTestDrive {

    public static void main(String[] args) {
        Books myBooks = new Books();
        int x = 0;

        Book myBooks0 = new Book();
        Book myBooks1 = new Book();
        Book myBooks2 = new Book();
        //
        myBooks0.title = "The Grapes of Java";
        myBooks0.title = "The Java Gatsby";
        myBooks0.title = "The Java CookBook";
        myBooks0.author = "bob";
        myBooks0.author = "sue";
        myBooks0.author = "ian";

        while(x < 3){
            System.out.println(myBooks.title);
            System.out.println("by");
            System.out.println(myBooks.author);
            x = x + 1;
        }
    }
}