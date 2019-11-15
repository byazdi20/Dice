
/**
 * Plays a dice rolling game.
 * See javadoc comments for description of games
 * There is an unfair guaranteed-winner game
 *
 * @author Brandon Yazdi
 */
public class Game
{
    /*
     * rolls two dice and prints sum of rolls
     */
    private int rollTwoDice() {
        Die gameDie = new Die();
        int roll1 = gameDie.roll();
        int roll2 = gameDie.roll();
        return (roll1+roll2);        
    }

    /*
     * Simulate player 1 rolling a die twice (by calling rollTwoDice).
     * Their score is the sum of the face values.
     * Simulate player 2 rolling a die twice (by calling rollTwoDice). 
     * Their score is the sum of the face values.
     * Print Player 1's score and Player 2's score to the terminal window.
     * Print which player won to the terminal window. (The higher score wins). If it is a tie, say so.
     */
    public void playGame() {
        int player1 = rollTwoDice();
        int player2 = rollTwoDice();
        System.out.println("Player 1: " + player1 + "Player 2: " + player2);
        if (player2 > player1) {
            System.out.println("Player 1 wins!");
        }
        if (player2 < player1) {
            System.out.println("Player 2 wins!");
        }
        if (player2 == player1) {
            System.out.println("Tie!");
        }
    }

    /* returns the number of times the die 
     * had to be rolled until the desired number came up.
     */
    public int counter(int desired) {
        Die gameDie = new Die();
        int count = 1;
        int number = gameDie.roll();
            while (number != desired) {
                number = gameDie.roll();
                count++;
            }
            return count;
    }
    
    /*
     * see description of counter method but this is for weighted die
     */
    public int weightedCounter(int desired) {
        WeightedDie gameDie = new WeightedDie();
        int count = 1;
        int number = gameDie.roll();
            while (number != desired) {
                number = gameDie.roll();
                count++;
            }
            return count;
    }
    
    /* 
     * exactly like playGame except it will keep playing the game
     * until Player 1 wins or ties
     * see playGame method comments for details
     */
    public void playUnfairGame() {
        int player1 = rollTwoDice();
        int player2 = rollTwoDice();
        while (player1 < player2) {
            player1 = rollTwoDice();
        }
        if (player2 > player1) {
            System.out.println("Player 1 wins!");
        }
        if (player2 < player1) {
            System.out.println("Player 2 wins!");
        }
        if (player2 == player1) {
            System.out.println("Tie!");
        }
        System.out.println("Player 1: " + player1 + "Player 2: " + player2);
    }
}
