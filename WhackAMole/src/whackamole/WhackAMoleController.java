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

    public static final DecimalFormat FORMAT = new DecimalFormat("#");
    public static int score;
    public static int highScore;
    static GameStructure test = new GameStructure();
    static int time = 10000; //length of the game in milliseconds (default 10s)
    static Timer timer = new Timer();
    static int n; //roll for what hole the object goes into

    //ImageView placeholders
    public static ImageView km = new ImageView();
    public static ImageView kb = new ImageView();
    public static ImageView ks = new ImageView();

    //Booleans for if a mole/bomb/spMole is in a hole
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

    //JavaFX elements
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
    public TextField highScoreTextField;

    @FXML
    void onHole1_1Clicked(ActionEvent event) {

        this.hole1_1.setImage(holeImage);

        if (moleIn && n == 0) {
            System.out.println("Mole Clicked");
            score += Mole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            moleIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }

            testRolls();
            
        } else if (bombIn && n == 0) {
            System.out.println("Bomb Clicked");
            score += Bomb.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            bombIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
            
        } else if (spMoleIn && n == 0) {
            System.out.println("SpecialMole Clicked");
            score += SpecialMole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            spMoleIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
        }
    }

    @FXML
    void onHole1_2Clicked(ActionEvent event) {

        this.hole1_2.setImage(holeImage);

        if (moleIn && n == 1) {
            System.out.println("Mole Clicked");
            score += Mole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            moleIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
            
        } else if (bombIn && n == 1) {
            System.out.println("Bomb Clicked");
            score += Bomb.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            bombIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
            
        } else if (spMoleIn && n == 1) {
            System.out.println("SpecialMole Clicked");
            score += SpecialMole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            spMoleIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
        }
    }

    @FXML
    void onHole1_3Clicked(ActionEvent event) {

        this.hole1_3.setImage(holeImage);

        if (moleIn && n == 2) {
            System.out.println("Mole Clicked");
            score += Mole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            moleIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
            
        } else if (bombIn && n == 2) {
            System.out.println("Bomb Clicked");
            score += Bomb.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            bombIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
            
        } else if (spMoleIn && n == 2) {
            System.out.println("SpecialMole Clicked");
            score += SpecialMole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            spMoleIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
        }
    }

    @FXML
    void onHole2_1Clicked(ActionEvent event) {

        this.hole2_1.setImage(holeImage);

        if (moleIn && n == 3) {
            System.out.println("Mole Clicked");
            score += Mole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            moleIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
            
        } else if (bombIn && n == 3) {
            System.out.println("Bomb Clicked");
            score += Bomb.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            bombIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
            
        } else if (spMoleIn && n == 3) {
            System.out.println("SpecialMole Clicked");
            score += SpecialMole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            spMoleIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
        }
    }

    @FXML
    void onHole2_2Clicked(ActionEvent event) {

        this.hole2_2.setImage(holeImage);

        if (moleIn && n == 4) {
            System.out.println("Mole Clicked");
            score += Mole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            moleIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
            
        } else if (bombIn && n == 4) {
            System.out.println("Bomb Clicked");
            score += Bomb.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            bombIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
            
        } else if (spMoleIn && n == 4) {
            System.out.println("SpecialMole Clicked");
            score += SpecialMole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            spMoleIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
        }
    }

    @FXML
    void onHole2_3Clicked(ActionEvent event) {

        this.hole2_3.setImage(holeImage);

        if (moleIn && n == 5) {
            System.out.println("Mole Clicked");
            score += Mole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            moleIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
            
        } else if (bombIn && n == 5) {
            System.out.println("Bomb Clicked");
            score += Bomb.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            bombIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
            
        } else if (spMoleIn && n == 5) {
            System.out.println("SpecialMole Clicked");
            score += SpecialMole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            spMoleIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
        }
    }

    @FXML
    void onHole3_1Clicked(ActionEvent event) {

        this.hole3_1.setImage(holeImage);

        if (moleIn && n == 6) {
            System.out.println("Mole Clicked");
            score += Mole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            moleIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
            
        } else if (bombIn && n == 6) {
            System.out.println("Bomb Clicked");
            score += Bomb.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            bombIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
            
        } else if (spMoleIn && n == 6) {
            System.out.println("SpecialMole Clicked");
            score += SpecialMole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            spMoleIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
        }
    }

    @FXML
    void onHole3_2Clicked(ActionEvent event) {

        this.hole3_2.setImage(holeImage);

        if (moleIn && n == 7) {
            System.out.println("Mole Clicked");
            score += Mole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            moleIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
            
        } else if (bombIn && n == 7) {
            System.out.println("Bomb Clicked");
            score += Bomb.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            bombIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
            
        } else if (spMoleIn && n == 7) {
            System.out.println("SpecialMole Clicked");
            score += SpecialMole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            spMoleIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
        }
    }

    @FXML
    void onHole3_3Clicked(ActionEvent event) {

        this.hole3_3.setImage(holeImage);

        if (moleIn && n == 8) {
            System.out.println("Mole Clicked");
            score += Mole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            moleIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
            
        } else if (bombIn && n == 8) {
            System.out.println("Bomb Clicked");
            score += Bomb.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            bombIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
            
        } else if (spMoleIn && n == 8) {
            System.out.println("SpecialMole Clicked");
            score += SpecialMole.VALUE;
            scoreTextField.setText(FORMAT.format(score));
            spMoleIn = false;
            if (Helper.timerRunning) {
                timer.purge();
                Helper.timerRunning = false;
            }
            testRolls();
        }
    }

    @FXML
    void onPauseButtonClick(ActionEvent event) {
        /* DISCARDED */
    }

    @FXML
    void onStartButtonClick(ActionEvent event) {

        //instantiates the timer and cancels any running timers
        TimerTask task = new Helper();
        timer.schedule(task, time);
        if (Helper.timerRunning) {
            timer.purge();
            Helper.timerRunning = false;
        }        
     
        //Initialize holes
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
        this.testRolls();
    }
    
    @FXML
    void on10secClicked(ActionEvent event) {
        time = 10000;
        System.out.println("Time set: 10 seconds");
    }

    @FXML
    void on30secClicked(ActionEvent event) {
        time = 30000;
        System.out.println("Time set: 30 seconds");
    }

    @FXML
    void on60secClicked(ActionEvent event) {
        time = 60000;
        System.out.println("Time set: 60 seconds");
    }

    public void endGame() {
        highScoreTextField.setText(FORMAT.format(highScore));
    }
    
    //performs the rolls
    public void testRolls() {

        if (test.roll < 5) {
            n = test.m.showObject();
            System.out.println("test.mRoll: " + test.roll);
            System.out.println("hole(n): " + n + "\n");

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
        }

        //bomb appears
        if (test.roll >= 5 && test.roll < 9) {
            n = test.b.showObject();
            System.out.println("test.bRoll: " + test.roll);
            System.out.println("hole(n): " + n + "\n");
            
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
        }

        //special mole appears
        if (test.roll >= 9) {
            n = test.s.showObject();
            System.out.println("test.sRoll: " + test.roll);
            System.out.println("hole(n): " + n + "\n");

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
        }
    }

}
