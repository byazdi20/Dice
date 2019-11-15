
/**
 * Write a Die class. This class will represent a fair, six-sided die.
 * It must keep track of face value. Six sides are 2, 3, 4, 5, 6, and 7.
 * Follows directions as we were not told the values the sides must be.
 * 
 * Brandon Yazdi
 */
public class Die
{
    private int value = (int)(Math.random()*6+1);

    /*
     * shows the last roll value
     */
    public int getValue() {
        return value;
    }

    /*
     * rolls die
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
