package edu.jamashie;

/**
 * Created by bampk on 4/26/2017.
 */
public class Hobbits {
    String name;
    public static void main(String[] args){
        Hobbits h = new Hobbits();
        int z = -1;
        while(z < 2) {
            z = z + 1;
            h = new Hobbits();
            h.name = "bilbo";
            if(z == 1){
                h.name = "frodo";
            }
            if(z == 2){
                h.name = "sam";
            }
            System.out.println(h.name + "is a");
            System.out.println("Good Hobbits Name");
        }

    }
}
