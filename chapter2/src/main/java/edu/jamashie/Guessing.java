package edu.jamashie;

/**
 * Created by bampk on 4/22/2017.
 */
public class Guessing {
    int number = 0;

    public void  guess(){
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
