package whackamole;

public class GameStructure {
    Bomb b = new Bomb(); 
    Mole m = new Mole();

    public int mRoll;
    public int bRoll;
    
    public GameStructure() {
    }

    public void startGame() {
        this.mRoll = m.roll();
        this.bRoll = b.roll();
    }
}