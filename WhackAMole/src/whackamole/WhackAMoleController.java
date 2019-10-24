package whackamole;

import java.io.File;
import java.text.DecimalFormat;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class WhackAMoleController {

    private static final DecimalFormat scoreFormat = new DecimalFormat("#");
    private static int score;

    File holeFile = new File("src/hole.png");
    Image holeImage = new Image(holeFile.toURI().toString());

    File moleInHoleFile = new File("src/moleInHole.png");
    Image moleInHoleImage = new Image(moleInHoleFile.toURI().toString());

    //Bomb bomb = new Bomb();
    Mole mole = new Mole();
    //SpecialMole spMole = new SpecialMole();
     
    
    @FXML
    private ImageView hole1_1;

    @FXML
    private ImageView hole1_2;

    @FXML
    private ImageView hole3_1;

    @FXML
    private ImageView hole3_2;

    @FXML
    private ImageView hole1_3;

    @FXML
    private ImageView hole3_3;

    @FXML
    private ImageView hole2_1;

    @FXML
    private ImageView hole2_2;

    @FXML
    private ImageView hole2_3;

    @FXML
    private TextField scoreTextView;

    @FXML
    private Button startButton;

    @FXML
    private Button pauseButton;
    
    @FXML
    private TextField highScoreTextView;
    
    @FXML
    void onHole1_1Clicked(ActionEvent event){
    	this.hole1_1.setImage(this.holeImage);
    }

    @FXML
    void onHole1_2Clicked(ActionEvent event){
    	this.hole1_2.setImage(this.holeImage);
    }
    
    @FXML
    void onHole1_3Clicked(ActionEvent event){        
    	this.hole1_3.setImage(this.holeImage);
    }
    
    @FXML
    void onHole2_1Clicked(ActionEvent event){
    	this.hole2_1.setImage(this.holeImage);        
    }
    
    @FXML
    void onHole2_2Clicked(ActionEvent event){        
    	this.hole2_2.setImage(this.holeImage);        
    }
    
    @FXML
    void onHole2_3Clicked(ActionEvent event){        
    	this.hole2_3.setImage(this.holeImage);        
    }
    
    @FXML
    void onHole3_1Clicked(ActionEvent event){        
    	this.hole3_1.setImage(this.holeImage);        
    }
    
    @FXML
    void onHole3_2Clicked(ActionEvent event){
    	this.hole3_2.setImage(this.holeImage);        
    }
    
    @FXML
    void onHole3_3Clicked(ActionEvent event){        
    	this.hole3_3.setImage(this.holeImage);        
    }
    
    @FXML
    void onPauseButtonClick(ActionEvent event) { 
     
    }
 
    @FXML
    void onStartButtonClick(ActionEvent event) {
        
        //Initializes the holes / sets the score to 0
        hole1_1.setImage(holeImage);
        hole1_2.setImage(holeImage);
        hole1_3.setImage(holeImage);
        hole2_1.setImage(holeImage);
        hole2_2.setImage(holeImage);
        hole2_3.setImage(holeImage);
        hole3_1.setImage(holeImage);
        hole3_2.setImage(holeImage);
        hole3_3.setImage(holeImage);
        score = 0;
        scoreTextView.setText(scoreFormat.format(score));

        GameStructure test = new GameStructure();
        
            test.startGame();
            

        while (score < 50) {
            test.startGame();
            if (test.mRoll == 7) {
            	
                int n = test.m.showObject();
                
                System.out.println("n: " + n);
                System.out.println("test.mRoll: " + test.mRoll);
                
                Object k;
                
                
                switch (n) {
                    case 0:
                        hole1_1.setImage(moleInHoleImage);
                        k = hole1_1;
                        break;
                    case 1:
                        hole1_2.setImage(moleInHoleImage);
                        k = hole1_2;
                        break;
                    case 2:
                        hole1_3.setImage(moleInHoleImage);
                        k = hole1_3;
                        break;
                    case 3:
                        hole2_1.setImage(moleInHoleImage);
                        k = hole2_1;
                        break;
                    case 4:
                        hole2_2.setImage(moleInHoleImage);
                        k = hole2_2;
                        break;
                    case 5:
                        hole2_3.setImage(moleInHoleImage);
                        k = hole2_3;
                        break;
                    case 6:
                        hole3_1.setImage(moleInHoleImage);
                        k = hole3_1;
                        break;
                    case 7:
                        hole3_2.setImage(moleInHoleImage);
                        k = hole3_2;
                        break;
                    case 8:
                        hole3_3.setImage(moleInHoleImage);
                        k = hole3_3;
                        break;
                }
            }
            
            Timer timer = new Timer();
            TimerTask task = new Helper();
            timer.schedule(task, 3000);
            if (task.getY() ==  1) {
            }
            
            score = 50;
        }
    }

}