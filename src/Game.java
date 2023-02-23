/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */
import java.util.Scanner;

public class Game {
    Player p1;
    Player p2;
    Dice die;


    public Game(Player p1, Player p2, Dice die) { /* Constructor named "Game" that takes parameters Player p1,
      PLayer p2, and Dice die, and assigns each parameter to its sister instanced variable */

        this.p1 = p1;

        this.p2 = p2;

        this.die = die;

    }

    public void play() { // Governs the order that each player uses the takeTurn method to play the game

        Player current = this.p1; // Current is assigned to player 1
        takeTurn(current); // Player 1 takes their turn
        nextPlayer(current = this.p2); // Reassigns current to player 2
        takeTurn(current); // Player 2 takes their turn
        System.out.println(announceWinner()); // Uses announceWinner to announce winner of game

    }

    public Player nextPlayer(Player current) { // Governs who's turn it is
        if (current == this.p1) { // If current is = player 1
            return this.p2; // Switch to player 2
        } if (current == this.p2){ // If current is = player 2
            return this.p1; // Switch to player 1
        } return current; // Returns current value at end of method
    }

    public void takeTurn(Player player) { // Governs how players take turn - uses parameter player of Class Player
        player.toss(this.die); // Player uses toss method with input variable die (not sure how this works 100%)
    }

    public String announceWinner() { // Prints player scores, compares for winner, announces winner
        System.out.println("Player 1's score is " + p1.getScore()); // Outputs player 1 score
        System.out.println("Player 2's score is " + p2.getScore()); // Outputs player 2 score
        if (p1.getScore() > p2.getScore()) { // If player 1 using getScore has a greater score than player 2
            System.out.println("Player 1 is the winner!"); // Player 1 is winner
        } else if (p1.getScore() < p2.getScore()) { // If player 1 has a lesser score than player 2
            System.out.println("Player 2 is the winner!"); // Player 2 is winner
        } else {
            System.out.println("Tie!"); // If both scores are the same ... Tie!
        } return""; // Generic return value
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("How many sides should the dice have?"); // Asks for input
        int dSides = in.nextInt(); // Assigns input to variable

        Game game = new Game(new Player("Player1"), new  Player("Player 2"), new Dice(dSides));
        /* Creates game object named "game" that constructs a Player 1 & 2 and a dice object */

        game.play(); // Calls game object and play method

        }
// Crazy sleep deprived laughter* ... "HAHAHAHA it works!  I'm done!"


    }

