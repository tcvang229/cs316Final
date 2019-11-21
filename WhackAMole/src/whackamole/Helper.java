package whackamole;
import java.util.TimerTask;

public class Helper extends TimerTask{

        WhackAMoleController controller = new WhackAMoleController();
    
	@Override
	public void run() {
                WhackAMoleController.km.setImage(WhackAMoleController.holeImage);
                WhackAMoleController.kb.setImage(WhackAMoleController.holeImage);
                WhackAMoleController.ks.setImage(WhackAMoleController.holeImage);
                WhackAMoleController.moleIn = false;
                WhackAMoleController.bombIn = false;
                WhackAMoleController.spMoleIn = false;
                System.out.println("Timer Finished\n");
                //controller.testRolls();
                
	}
        
}
