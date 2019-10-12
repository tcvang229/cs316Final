package whackamole;

import java.io.File;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;


public class WhackAMoleController {

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
    void onHole1_1Clicked(ActionEvent event){
        File file = new File("src/hole.png");
        Image image = new Image(file.toURI().toString());
        hole1_1.setImage(image);
    }
   
    
    
    @FXML
    void onPauseButtonClick(ActionEvent event) { 

        
    }

    
    @FXML
    void onStartButtonClick(ActionEvent event) {
        
        //Initializes the holes
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
        
        
    }

}