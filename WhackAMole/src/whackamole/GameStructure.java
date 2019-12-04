package whackamole;
import java.util.Random;

public class GameStructure {
    
    Bomb b = new Bomb(); 
    Mole m = new Mole();
    SpecialMole s = new SpecialMole();
    Random rand = new Random();

    /*public int mRoll;
    public int bRoll;
    public int sRoll;*/
    public int roll;
    
    public GameStructure() {
    }

    public void startGame() {
        this.roll = rand.nextInt(9);
        /*this.mRoll = m.roll();
        this.bRoll = b.roll();
        this.sRoll = s.roll();*/
    }
    
}