package whackamole;
import java.util.TimerTask;

public class Helper extends TimerTask{
	public static int y;

	@Override
	public void run() {
		this.y = 1;
                        hole2_3.setImage(moleInHoleImage);
            	
            	
	}
	
	public static int getY() {
		return y;
	}
}
