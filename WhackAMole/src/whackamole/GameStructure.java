package whackamole;

public class GameStructure {

    // default seconds in game
    protected int time;

    // default overload, default time = 60
    public GameStructure() {
        this.time = 60;
    }

    // overload allows custom time
    // used for change of difficulty
    // of game
    public GameStructure(int time) {
        this.time = time;
    }
}