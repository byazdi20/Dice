    
    /**
     * This is a special Die similar to the Die class with the same methods except the non-required one.
     * The difference is that WeightedDie is not a FAIR die. Even numbers are twice as likely as odd.
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
         * the output will be the result of this unfair roll
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
