/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */
import java.lang.reflect.*;

public class Player {
    private String name;
    private int score;


    public Player(String name) { // Constructor that takes a String parameter "name
        // and equates it to instanced variable "name"
        this.name = name;
    }
    
    public String getName() {
        return this.name; // returns value stored at instanced variable "name"
    }

    public int getScore() {
        return this.score; // returns instanced variable "score"
    }

    public int toss(Dice die) { // Returns parameter "die" of class Dice

        die.roll(); // Parameter "die" is input to method (in class Dice) roll to generate random number

        score = die.view(); // score variable is = to view from dice class

        return(score);
    }

    public static void main(String[] args) {

    }
}
