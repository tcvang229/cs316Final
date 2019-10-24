package whackamole;

import java.util.Random;

public class SpecialMole extends Mole {

    public SpecialMole() {
    }

    @Override
    public int roll() {
        /*int n = (int) Math.ceil((Math.random() * 100));
        return n;*/
        Random random = new Random();
        int n = random.nextInt(10);
        return n;
    }

    @Override
    public int showObject() {
        Random random = new Random();
        int n = random.nextInt(9);
        return n;
    }
}