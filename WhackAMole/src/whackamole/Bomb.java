package whackamole;

import java.util.Random;

public class Bomb extends Hole {

    Random rand = new Random();
    final static int VALUE = -10;
    
    public Bomb() {
    }

    /*@Override
    public int roll() {
        int n = rand.nextInt(9);
        return n;
    }*/

    @Override
    public int showObject() {
        int n = rand.nextInt(9);
        //int n = 0;
        return n;
    }
    
}