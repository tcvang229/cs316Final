package whackamole;

import java.util.Random;

public class SpecialMole extends Hole {

    Random rand = new Random();
    final static int VALUE = 5;
    
    public SpecialMole() {
    }

    /*@Override
    public int roll() {
        int n = rand.nextInt(10);
        return n;
    }*/

    @Override
    public int showObject() {
        int n = rand.nextInt(9);
        //int n = 0;
        return n;
    }
    
}