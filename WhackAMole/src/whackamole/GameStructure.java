package whackamole;
import java.util.Random;

public class GameStructure {
    
    Bomb b = new Bomb(); 
    Mole m = new Mole();
    SpecialMole s = new SpecialMole();
    Random rand = new Random();

    public int roll;
    
    public GameStructure() {
    }
    
    public void myRoll() {
    	this.roll = rand.nextInt(10);
    }
    
    public void startGame() {
    }
    
}