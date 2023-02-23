/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */
import java.util.Random;
import java.util.Scanner;
public class Dice { //

    private int sideFacingUp; // Declares instanced (non-static variable), integer variable, named "sideFacingUp"
    private int sides; // Declares instanced (non-static variable), integer variable, named "sides"
    private Random randomGenerator; // Declares instanced (non-static variable), class Random, variable named "randomGenerator"


    public Dice(int sides) { // Input: sides, Output: sides
        // Constructor named "Dice," uses parameter also named, type integer, "sides"

        this.sides = sides; // Declares both variable "sides" with parameter named "sides" as equivalent of each other...
        /* private sides is instanced and "Dice sides" is owned by constructor, creates a pipeline between two.
        (.this) pulls down specific instance of sides from above. */

        this.randomGenerator = new Random(); // Initializes an instance of Random class and equivocates it to...
        // randomGenerator instanced variable using (this.)
    }

    public void roll() { /* Input: sides, Output: sideFacingUp
    Generates random number between 1 and sides and assigns output to sideFacingUp */

        this.sideFacingUp = this.randomGenerator.nextInt(this.sides) + 1; /* Uses (this.) to use instanced variable
         sideFacingUp and equate it to (this.) randomGenerator. Then takes the next token of input using nextInt
         from variable (this.) sides. +1 off sets the upper "bounds" of five so the range is 1 - 6 */
    }

    public int view() { /* Input: sideFacingUp, Output:sideFacingUp
    Returns value stores in instance variable sideFacingUp */

        return this.sideFacingUp; // Returns stored value in sideFacingUp

    }

    public static void main(String[] args) {

    }

}
