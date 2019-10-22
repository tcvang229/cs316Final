package whackamole;

public class Bomb extends Hole {

    @Override
    public int roll() {
        return 5;
    }

    @Override
    public void showObject() {
    }
}