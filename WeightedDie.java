    
    /**
     * Write a Die class. This class will represent a fair, six-sided die.
     * It must keep track of face value. Six sides are 2, 3, 4, 5, 6, and 7.
     * Follows directions as we were not told the values the sides must be.
     * 
     * Brandon Yazdi
     */
    public class WeightedDie
    {
        private int value = 2;
    
        /*
         * shows the last roll value
         */
        public int getValue() {
            return value;
        }
    
        /*
         * Simulates die roll with even numbers being twice as likely
         * 
         */
        public int roll() {
            int n = (int)(Math.random()*9+1);
        if (n==1) {value=1;}
        if (n==2) {value=2;}
        if (n==3) {value=2;}
        if (n==4) {value=3;}
        if (n==5) {value=4;}
        if (n==6) {value=4;}
        if (n==7) {value=5;}
        if (n==8) {value=6;}
        if (n==9) {value=6;}
        return value;
    }

    /*
     * turns value to String equivalent for no reason
     */
    public String toString() {
        return String.valueOf(value);
    }


}
