package whackamole;
//import java.Math.random;


public class Mole extends Hole {

    @Override
    public int roll() {
        int n = (int) Math.ceil((Math.random() * 100));
        return n;
    }

    @Override
    public void showObject() {
    }
}