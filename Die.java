
/**
 * Write a Die class. This class will represent a fair, six-sided die.
 * It must keep track of face value. Six sides are 1, 2, 3, 4, 5, 6.
 * Follows directions as we were not told the values the sides must be.
 * 
 * Brandon Yazdi
 */
public class Die
{
    private int value = (int)(Math.random()*6+1);

    /*
     * shows the last roll value
     * output is value
     */
    public int getValue() {
        return value;
    }

    /*
     * "rolls" die
     * outputs new value rolled which is a pseudorandom int 1 thru 6
     */
    public int roll() {
        value = (int)(Math.random()*6+1);
        return value;
    }

    /*
     * turns value to String equivalent for no reason
     */
    public String toString() {
        return String.valueOf(value);
    }

    /*
     * rolls die n times and prints values
     * n is user-inputted
     * for each n, prints the roll value separately
     * rolls spaced on a single line with commas in between
     */
    public void printSomeRolls(int n) {
        if (n==1) {
            System.out.print((int)(Math.random()*6+1));
        }
        if (n>1) {
            for (int i = 1; i < n; i++) {
                System.out.print((int)(Math.random()*6+1) + ", ");
            }
            System.out.println((int)(Math.random()*6+1) + ".");
        }
        else
            System.out.print("Invalid number of rolls.");
    }
}
