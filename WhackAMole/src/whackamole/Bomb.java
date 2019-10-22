package whackamole;

public class Bomb implements Hole {

    @Override
    public int roll() {
        return 5;
    }

    @Override
    public void showObject() {
    }
}