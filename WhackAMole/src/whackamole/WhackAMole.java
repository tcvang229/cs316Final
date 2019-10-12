
package whackamole;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class WhackAMole extends Application{
   
   public void start(Stage stage) throws Exception {
      Parent root = 
         FXMLLoader.load(getClass().getResource("WhackAMoleFXML.fxml"));

      Scene scene = new Scene(root); // attach scene graph to scene
      stage.setTitle("Whack-A-Mole"); // displayed in window's title bar
      stage.setScene(scene); // attach scene to stage
      stage.show(); // display the stage
   }

    public static void main(String[] args) {
        launch(args);
    }
    
}
