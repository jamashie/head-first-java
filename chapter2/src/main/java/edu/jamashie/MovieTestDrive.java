package edu.jamashie;

/**
 * Created by bampk on 4/18/2017.
 */
public class MovieTestDrive {
    public static void main(String[]agrs){
        Movies one = new Movies();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;
        Movies two = new Movies();
        two.title = "Lost in Cubicle space";
        two.genre = "Comedy";
        two.rating =5;
        two.playIt();
        Movies three = new Movies();
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating =127;

    }
}
