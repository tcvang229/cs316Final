package whackamole;

import java.io.File;
import java.text.DecimalFormat;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import java.util.Timer;
import java.util.TimerTask;


public class WhackAMoleController {

    private static final DecimalFormat FORMAT = new DecimalFormat("#");
    private static int score;
    private static int highScore;
    
    //ImageView placeholders
    public static ImageView km = new ImageView();
    public static ImageView kb = new ImageView();
    public static ImageView ks = new ImageView();
    
    static boolean moleIn = false;
    static boolean bombIn = false;
    static boolean spMoleIn = false;
    
    //creates variables for the images
    static final File HOLE_FILE = new File("src/hole.png");
    static Image holeImage = new Image(HOLE_FILE.toURI().toString());

    static final File MOLE_FILE = new File("src/mole.png");
    static Image moleImage = new Image(MOLE_FILE.toURI().toString());
    
    static final File BOMB_FILE = new File("src/bomb.png");
    static Image bombImage = new Image(BOMB_FILE.toURI().toString());
    
    static final File SPEC_FILE = new File("src/spMole.png");
    static Image spMoleImage = new Image(SPEC_FILE.toURI().toString());
       
    
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
    private TextField scoreTextField;

    @FXML
    private Button startButton;

    @FXML
    private Button pauseButton;
    
    @FXML
    private TextField highScoreTextField;
    
    
    @FXML
    void onHole1_1Clicked(ActionEvent event){
        
    	this.hole1_1.setImage(holeImage);
        
        if (moleIn){
            System.out.println("Mole Clicked");
            score += Mole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            moleIn = false;
        }
        else if (bombIn){
            System.out.println("Bomb Clicked");
            score += Bomb.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            bombIn = false;
        }
        else if (spMoleIn){
            System.out.println("SpecialMole Clicked");
            score += SpecialMole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            spMoleIn = false;
        }
    }

    @FXML
    void onHole1_2Clicked(ActionEvent event){
        
    	this.hole1_2.setImage(holeImage);
        
        if (moleIn){
            System.out.println("Mole Clicked");
            score += Mole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            moleIn = false;
        }
        else if (bombIn){
            System.out.println("Bomb Clicked");
            score += Bomb.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            bombIn = false;
        }
        else if (spMoleIn){
            System.out.println("SpecialMole Clicked");
            score += SpecialMole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            spMoleIn = false;
        }
    }
    
    @FXML
    void onHole1_3Clicked(ActionEvent event){   
        
    	this.hole1_3.setImage(holeImage);
        
        if (moleIn){
            System.out.println("Mole Clicked");
            score += Mole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            moleIn = false;
        }
        else if (bombIn){
            System.out.println("Bomb Clicked");
            score += Bomb.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            bombIn = false;
        }
        else if (spMoleIn){
            System.out.println("SpecialMole Clicked");
            score += SpecialMole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            spMoleIn = false;
        }
    }
    
    @FXML
    void onHole2_1Clicked(ActionEvent event){
    	
        this.hole2_1.setImage(holeImage);
        
        if (moleIn){
            System.out.println("Mole Clicked");
            score += Mole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            moleIn = false;
        }
        else if (bombIn){
            System.out.println("Bomb Clicked");
            score += Bomb.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            bombIn = false;
        }
        else if (spMoleIn){
            System.out.println("SpecialMole Clicked");
            score += SpecialMole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            spMoleIn = false;
        }
    }
    
    @FXML
    void onHole2_2Clicked(ActionEvent event){  
        
    	this.hole2_2.setImage(holeImage);
        
        if (moleIn){
            System.out.println("Mole Clicked");
            score += Mole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            moleIn = false;
        }
        else if (bombIn){
            System.out.println("Bomb Clicked");
            score += Bomb.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            bombIn = false;
        }
        else if (spMoleIn){
            System.out.println("SpecialMole Clicked");
            score += SpecialMole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            spMoleIn = false;
        }
    }
    
    @FXML
    void onHole2_3Clicked(ActionEvent event){ 
        
    	this.hole2_3.setImage(holeImage);
        
        if (moleIn){
            System.out.println("Mole Clicked");
            score += Mole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            moleIn = false;
        }
        else if (bombIn){
            System.out.println("Bomb Clicked");
            score += Bomb.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            bombIn = false;
        }
        else if (spMoleIn){
            System.out.println("SpecialMole Clicked");
            score += SpecialMole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            spMoleIn = false;
        }
    }
    
    @FXML
    void onHole3_1Clicked(ActionEvent event){    
        
    	this.hole3_1.setImage(holeImage);    
        
        if (moleIn){
            System.out.println("Mole Clicked");
            score += Mole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            moleIn = false;
        }
        else if (bombIn){
            System.out.println("Bomb Clicked");
            score += Bomb.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            bombIn = false;
        }
        else if (spMoleIn){
            System.out.println("SpecialMole Clicked");
            score += SpecialMole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            spMoleIn = false;
        }
    }
    
    @FXML
    void onHole3_2Clicked(ActionEvent event){
        
    	this.hole3_2.setImage(holeImage);  
        
        if (moleIn){
            System.out.println("Mole Clicked");
            score += Mole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            moleIn = false;
        }
        else if (bombIn){
            System.out.println("Bomb Clicked");
            score += Bomb.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            bombIn = false;
        }
        else if (spMoleIn){
            System.out.println("SpecialMole Clicked");
            score += SpecialMole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            spMoleIn = false;
        }
    }
    
    @FXML
    void onHole3_3Clicked(ActionEvent event){  
        
    	this.hole3_3.setImage(holeImage);  
        
        if (moleIn){
            System.out.println("Mole Clicked");
            score += Mole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            moleIn = false;
        }
        else if (bombIn){
            System.out.println("Bomb Clicked");
            score += Bomb.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            bombIn = false;
        }
        else if (spMoleIn){
            System.out.println("SpecialMole Clicked");
            score += SpecialMole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            spMoleIn = false;
        }
    }
    
    @FXML
    void onPauseButtonClick(ActionEvent event) {
        
    }
 
    @FXML
    void onStartButtonClick(ActionEvent event) {
        
        //Initialize holes and GameStructure
        hole1_1.setImage(holeImage);
        hole1_2.setImage(holeImage);
        hole1_3.setImage(holeImage);
        hole2_1.setImage(holeImage);
        hole2_2.setImage(holeImage);
        hole2_3.setImage(holeImage);
        hole3_1.setImage(holeImage);
        hole3_2.setImage(holeImage);
        hole3_3.setImage(holeImage);
        
        //set the score to 0
        score = 0;
        scoreTextField.setText(FORMAT.format(score));
        
        //start the game
        GameStructure test = new GameStructure();
        test.startGame();
           
        //while (score < 50) {
        int testInt = 0;
        while (testInt < 50) {  
        
            test.startGame();
            
            //mole appears
            if (test.mRoll == 3 || test.mRoll == 4 || test.mRoll == 5) {
            	
                int n = test.m.showObject();
                
                System.out.println("test.mRoll: " + test.mRoll);
                System.out.println("hole(n): " + n);
  
                switch (n) {
                    case 0:
                        hole1_1.setImage(moleImage);
                        moleIn = true;
                        km = hole1_1;
                        break;
                    case 1:
                        hole1_2.setImage(moleImage);
                        moleIn = true;
                        km = hole1_2;
                        break;
                    case 2:
                        hole1_3.setImage(moleImage);
                        moleIn = true;
                        km = hole1_3;
                        break;
                    case 3:
                        hole2_1.setImage(moleImage);
                        moleIn = true;
                        km = hole2_1;
                        break;
                    case 4:
                        hole2_2.setImage(moleImage);
                        moleIn = true;
                        km = hole2_2;
                        break;
                    case 5:
                        hole2_3.setImage(moleImage);
                        moleIn = true;
                        km = hole2_3;
                        break;
                    case 6:
                        hole3_1.setImage(moleImage);
                        moleIn = true;
                        km = hole3_1;
                        break;
                    case 7:
                        hole3_2.setImage(moleImage);
                        moleIn = true;
                        km = hole3_2;
                        break;
                    case 8:
                        hole3_3.setImage(moleImage);
                        moleIn = true;
                        km = hole3_3;
                        break;
                }
                
                Timer timer = new Timer();
                TimerTask task = new Helper();
                timer.schedule(task, 3000); //3 seconds   
                
            }
            
            //bomb appears
            if (test.bRoll == 1 || test.bRoll == 2) {
            	
                int n = test.b.showObject();
                
                System.out.println("test.bRoll: " + test.bRoll);
                System.out.println("hole(n): " + n);
  
                switch (n) {
                    case 0:
                        hole1_1.setImage(bombImage);
                        bombIn = true;
                        kb = hole1_1;
                        break;
                    case 1:
                        hole1_2.setImage(bombImage);
                        bombIn = true;
                        kb = hole1_2;
                        break;
                    case 2:
                        hole1_3.setImage(bombImage);
                        bombIn = true;
                        kb = hole1_3;
                        break;
                    case 3:
                        hole2_1.setImage(bombImage);
                        bombIn = true;
                        kb = hole2_1;
                        break;
                    case 4:
                        hole2_2.setImage(bombImage);
                        bombIn = true;
                        kb = hole2_2;
                        break;
                    case 5:
                        hole2_3.setImage(bombImage);
                        bombIn = true;
                        kb = hole2_3;
                        break;
                    case 6:
                        hole3_1.setImage(bombImage);
                        bombIn = true;
                        kb = hole3_1;
                        break;
                    case 7:
                        hole3_2.setImage(bombImage);
                        bombIn = true;
                        kb = hole3_2;
                        break;
                    case 8:
                        hole3_3.setImage(bombImage);
                        bombIn = true;
                        kb = hole3_3;
                        break;
                }
                
                Timer timer = new Timer();
                TimerTask task = new Helper();
                timer.schedule(task, 3000); //3 seconds   
                
            }
            
            //special mole appears
            if (test.sRoll == 0) {
            	
                int n = test.s.showObject();
                
                System.out.println("test.sRoll: " + test.sRoll);
                System.out.println("hole(n): " + n);
  
                switch (n) {
                    case 0:
                        hole1_1.setImage(spMoleImage);
                        spMoleIn = true;
                        ks = hole1_1;
                        break;
                    case 1:
                        hole1_2.setImage(spMoleImage);
                        spMoleIn = true;
                        ks = hole1_2;
                        break;
                    case 2:
                        hole1_3.setImage(spMoleImage);
                        spMoleIn = true;
                        ks = hole1_3;
                        break;
                    case 3:
                        hole2_1.setImage(spMoleImage);
                        spMoleIn = true;
                        ks = hole2_1;
                        break;
                    case 4:
                        hole2_2.setImage(spMoleImage);
                        spMoleIn = true;
                        ks = hole2_2;
                        break;
                    case 5:
                        hole2_3.setImage(spMoleImage);
                        spMoleIn = true;
                        ks = hole2_3;
                        break;
                    case 6:
                        hole3_1.setImage(spMoleImage);
                        spMoleIn = true;
                        ks = hole3_1;
                        break;
                    case 7:
                        hole3_2.setImage(spMoleImage);
                        spMoleIn = true;
                        ks = hole3_2;
                        break;
                    case 8:
                        hole3_3.setImage(spMoleImage);
                        spMoleIn = true;
                        ks = hole3_3;
                        break;
                }
                
                Timer timer = new Timer();
                TimerTask task = new Helper();
                timer.schedule(task, 1000); //1 second  
                
                /*if(score >= highScore){
                    highScoreTextField.setText(FORMAT.format(score));
                }*/
                
            }
            
            //score = 50;
            testInt = 50;
            
        }
    }

}