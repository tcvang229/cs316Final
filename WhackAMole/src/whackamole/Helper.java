package whackamole;
import java.util.TimerTask;

public class Helper extends TimerTask{

        WhackAMoleController controller = new WhackAMoleController();
        static boolean timerRunning = false;
    
	@Override
	public void run() {
                this.timerRunning = true;
                WhackAMoleController.km.setImage(WhackAMoleController.holeImage);
                WhackAMoleController.kb.setImage(WhackAMoleController.holeImage);
                WhackAMoleController.ks.setImage(WhackAMoleController.holeImage);
                WhackAMoleController.moleIn = false;
                WhackAMoleController.bombIn = false;
                WhackAMoleController.spMoleIn = false;
                System.out.println("Timer Finished\n");
                
                if (controller.score > controller.highScore){
                    controller.highScore = controller.score;
                }
                System.out.println("High Score: " + controller.highScore);
                //controller.endGame();
                
	}
        
}
