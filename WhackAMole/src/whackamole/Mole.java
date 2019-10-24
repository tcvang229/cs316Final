package whackamole;

import java.util.Random;

public class Mole extends Hole {

    Random rand = new Random();
    final static int VALUE = 2;
    
    public Mole() {
    }

    @Override
    public int roll() {
        int n = rand.nextInt(9);
        return n;
    }

    @Override
    public int showObject() {
        int n = rand.nextInt(9);
        //int n = 0;
        return n;
    }
    
}