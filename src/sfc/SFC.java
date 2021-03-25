package sfc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @version PRE-ALPHA 0.1 (work in progress...)
 * @author Frenk K. Chambers
 */

public class SFC extends Application {
    
    public static Stage window;
    public static Scene sceneMain, sceneCredits, sceneChangelog, sceneGame;
    public static String name = "";
    public static String Role = "";
    
    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        
        Parent rootMain = FXMLLoader.load(getClass().getResource("FXML_SFC_MAIN.fxml"));
        Parent rootCredits = FXMLLoader.load(getClass().getResource("FXML_SFC_CREDITS.fxml"));
        Parent rootChangelog = FXMLLoader.load(getClass().getResource("FXML_SFC_CHANGELOG.fxml"));
        Parent rootGame = FXMLLoader.load(getClass().getResource("FXML_SFC_GAME.fxml"));
        
        sceneMain = new Scene(rootMain);
        sceneCredits = new Scene(rootCredits);
        sceneChangelog = new Scene(rootChangelog);
        sceneGame = new Scene(rootGame);
        
        window.setScene(sceneMain);
        window.setTitle("SFC 2020");
        window.show();
    }
    
    public static void main(String[] args) {
        launch(args);
        
        
    }
    
}
