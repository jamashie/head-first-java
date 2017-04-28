package edu.jamashie;
/**
 * Created by bampk on 4/26/2017.
 */
public class BookTestDrive {

    public static void main(String[] args) {
        Books myBooks = new Books();
        int x = 0;

        Books myBooks0 = new Books();
        Books myBooks1 = new Books();
        Books myBooks2 = new Books();

        myBooks0.title = "The Grapes of Java";
        myBooks1.title = "The Java Gatsby";
        myBooks2.title = "The Java CookBook";
        myBooks0.author = "bob";
        myBooks1.author = "sue";
        myBooks2.author = "ian";

        while(x < 3){
            System.out.println(myBooks.title);
            System.out.println("by");
            System.out.println(myBooks.author);
            x = x + 1;
        }
    }
}