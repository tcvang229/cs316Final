package whackamole;

import java.io.File;
import java.math.BigDecimal;
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
        File file = new File("src/hole.png");
        Image image = new Image(file.toURI().toString());
        hole1_1.setImage(image);
        score += 5;
        scoreTextView.setText(scoreFormat.format(score));
        File file2 = new File("src/moleInHole.png");
        Image image2 = new Image(file2.toURI().toString());
        hole2_2.setImage(image2);
    }  
    
    @FXML
    void onHole1_2Clicked(ActionEvent event){
        
    }
    
    @FXML
    void onHole2_2Clicked(ActionEvent event){
        File file = new File("src/hole.png");
        Image image = new Image(file.toURI().toString());
        hole2_2.setImage(image);
        score += 5;
        scoreTextView.setText(scoreFormat.format(score));
        File file2 = new File("src/moleInHole.png");
        Image image2 = new Image(file2.toURI().toString());
        hole3_1.setImage(image2);
    }
    
    @FXML
    void onPauseButtonClick(ActionEvent event) { 
     
    }
 
    @FXML
    void onStartButtonClick(ActionEvent event) {
        
        //Initializes the holes / sets the score to 0
        File file = new File("src/hole.png");
        File file2 = new File("src/moleInHole.png");
        Image image = new Image(file.toURI().toString());
        Image image2 = new Image(file2.toURI().toString());
        hole1_1.setImage(image2);
        hole1_2.setImage(image);
        hole1_3.setImage(image);
        hole2_1.setImage(image);
        hole2_2.setImage(image);
        hole2_3.setImage(image);
        hole3_1.setImage(image);
        hole3_2.setImage(image);
        hole3_3.setImage(image);
        scoreTextView.setText("0");
        
        
    }

}