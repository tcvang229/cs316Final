package whackamole;

public class GameStructure {
    
    Bomb b = new Bomb(); 
    Mole m = new Mole();
    SpecialMole s = new SpecialMole();

    public int mRoll;
    public int bRoll;
    public int sRoll;
    
    public GameStructure() {
    }

    public void startGame() {
        this.mRoll = m.roll();
        this.bRoll = b.roll();
        this.sRoll = s.roll();
    }
    
}