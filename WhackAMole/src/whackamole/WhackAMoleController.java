package whackamole;

import java.io.File;
import java.text.DecimalFormat;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;

public class WhackAMoleController {

    private static final DecimalFormat scoreFormat = new DecimalFormat("#");
    private static int score;
    File holeFile = new File("src/hole.png");
    Image holeImage = new Image(holeFile.toURI().toString());
    File moleFile = new File("src/mole.png");
    Image moleImage = new Image(moleFile.toURI().toString());
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
        if(Mole.roll() == 10){
            hole1_1.setImage(moleInHoleImage);
            scoreTextView.setText(scoreFormat.format(score + Mole.getPointValue()));
        }
    }  
    
    @FXML
    void onHole1_2Clicked(ActionEvent event){
        
    }
    
    @FXML
    void onHole1_3Clicked(ActionEvent event){
        
    }
    
    @FXML
    void onHole2_1Clicked(ActionEvent event){
        
    }
    
    @FXML
    void onHole2_2Clicked(ActionEvent event){
        
    }
    
    @FXML
    void onHole2_3Clicked(ActionEvent event){
        
    }
    
    @FXML
    void onHole3_1Clicked(ActionEvent event){
        
    }
    
    @FXML
    void onHole3_2Clicked(ActionEvent event){
        
    }
    
    @FXML
    void onHole3_3Clicked(ActionEvent event){
        
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
        
        
    }

}