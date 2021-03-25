package sfc;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import static sfc.SFC.sceneGame;

/**
 * @version PRE-ALPHA 0.1 (work in progress...)
 * @author Frenk K. Chambers
 */

public class FXML_SFCController implements Initializable {
    
    public Forward forward;
    public Midfielder midfielder;
    public Defender defender;
    
    @FXML
    // gameScene
    public Label clickLabel;
    public Label nameLabel;
    public Label ageLabel;
    public Label clubLabel;
    public Label ratingLabel;
    public Label goalsLabel;
    public Label assistsLabel;
    public Label tacklesLabel;
    public Label gamesLabel;
    public Label seasonsLabel;
    public Button oneSeasonButton;
    public Button wholeCareerButton;
    public Button gameButtonGame;
    public Button changelogButtonGame;
    public Button creditsButtonGame;
    
    // mainScene
    public Button start;
    public Button creditsButtonMain;
    public Button changelogButtonMain;
    public RadioButton radioForward;
    public RadioButton radioMidfielder;
    public RadioButton radioDefender;
    public TextField nameField;
    public Label warningLabel;
    public ToggleGroup role;

    // creditsScene
    public Button changelogButtonCredits;
    public Button gameButtonCredits;
    
    // changelogScene
    public Button creditsButtonChangelog;
    public Button gameButtonChangelog;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    
    public void startButtonAction() {
        
        if(!"".equals(String.valueOf(nameField.getText())) && (role.getSelectedToggle()!= null)) {
            SFC.name = String.valueOf(nameField.getText());
            if(role.getSelectedToggle().equals(radioForward)) {
                SFC.Role = "Forward";
                SFC.window.setScene(SFC.sceneGame);
                
            } else if(role.getSelectedToggle().equals(radioMidfielder)) {
                SFC.Role = "Midfielder";
                SFC.window.setScene(SFC.sceneGame);
                
            } else if(role.getSelectedToggle().equals(radioDefender)) {
                SFC.Role = "Defender";
                SFC.window.setScene(SFC.sceneGame);
                
            } 
            
        } else {
            warningLabel.setText("PLEASE ENTER NAME AND SELECT ROLE!");
        }
        
    }
    
    public void creditsButton() {
        SFC.window.setScene(SFC.sceneCredits);
    }
    
    public void changelogButton() {
        SFC.window.setScene(SFC.sceneChangelog);
    }
    
    public void gameButton() {
        SFC.window.setScene(SFC.sceneMain);
    }
    
    public void creditsButtonRestart() throws IOException {
        SFC.window.setScene(SFC.sceneCredits);
        Parent rootGame = FXMLLoader.load(getClass().getResource("FXML_SFC_GAME.fxml"));
        sceneGame = new Scene(rootGame);
    }
    
    public void changelogButtonRestart() throws IOException {
        SFC.window.setScene(SFC.sceneChangelog);
        Parent rootGame = FXMLLoader.load(getClass().getResource("FXML_SFC_GAME.fxml"));
        sceneGame = new Scene(rootGame);
    }
    
    public void gameButtonRestart() throws IOException {
        SFC.window.setScene(SFC.sceneMain);
        Parent rootGame = FXMLLoader.load(getClass().getResource("FXML_SFC_GAME.fxml"));
        sceneGame = new Scene(rootGame);
    }
    
    public void gameSceneLoading() {
        
        clickLabel.setText("");
        clickLabel.setDisable(true);
        
        if("Forward".equals(SFC.Role)) {
            forward = new Forward(SFC.name);
            clubLabel.setText(forward.Club);
            ratingLabel.setText(String.valueOf(forward.SimpleRating));
            nameLabel.setText(SFC.name);
            
        } else if("Midfielder".equals(SFC.Role)) {
            midfielder = new Midfielder(SFC.name);
            clubLabel.setText(midfielder.Club);
            ratingLabel.setText(String.valueOf(midfielder.SimpleRating));
            nameLabel.setText(SFC.name);

        } else if("Defender".equals(SFC.Role)) {
            defender = new Defender(SFC.name);
            clubLabel.setText(defender.Club);
            ratingLabel.setText(String.valueOf(defender.SimpleRating));
            nameLabel.setText(SFC.name);

        }

        ageLabel.setText("Age: 18");
        goalsLabel.setText("Goals: 0");
        assistsLabel.setText("Assists: 0");
        tacklesLabel.setText("Tackles: 0");
        gamesLabel.setText("Games: 0");
        seasonsLabel.setText("");
    }
    
    public void oneSeasonPlay() {
        
        if("Forward".equals(SFC.Role)) {
            
            if(forward.Age <= forward.MAX_AGE) {
                seasonsLabel.setText(seasonsLabel.getText() + forward.oneSeason());
                clubLabel.setText(forward.Club);
                ratingLabel.setText(String.valueOf(forward.SimpleRating));
                ageLabel.setText("Age: " + forward.Age);
                goalsLabel.setText("Goals: " + forward.Goals);
                assistsLabel.setText("Assists: " + forward.Assists);
                tacklesLabel.setText("Tackles: " + forward.Tackles);
                gamesLabel.setText("Games: " + forward.Games);
            } else {
                seasonsLabel.setText(seasonsLabel.getText() + forward.EndCareer());
                oneSeasonButton.setDisable(true);
                wholeCareerButton.setDisable(true);
            }
            
        } else if("Midfielder".equals(SFC.Role)) {
            if(midfielder.Age <= midfielder.MAX_AGE) {
                seasonsLabel.setText(seasonsLabel.getText() + midfielder.oneSeason());
                clubLabel.setText(midfielder.Club);
                ratingLabel.setText(String.valueOf(midfielder.SimpleRating));
                ageLabel.setText("Age: " + midfielder.Age);
                goalsLabel.setText("Goals: " + midfielder.Goals);
                assistsLabel.setText("Assists: " + midfielder.Assists);
                tacklesLabel.setText("Tackles: " + midfielder.Tackles);
                gamesLabel.setText("Games: " + midfielder.Games);
            } else {
                seasonsLabel.setText(seasonsLabel.getText() + midfielder.EndCareer());
                oneSeasonButton.setDisable(true);
                wholeCareerButton.setDisable(true);
            }

        } else if("Defender".equals(SFC.Role)) {
            if(defender.Age <= defender.MAX_AGE) {
                seasonsLabel.setText(seasonsLabel.getText() + defender.oneSeason());
                clubLabel.setText(defender.Club);
                ratingLabel.setText(String.valueOf(defender.SimpleRating));
                ageLabel.setText("Age: " + defender.Age);
                goalsLabel.setText("Goals: " + defender.Goals);
                assistsLabel.setText("Assists: " + defender.Assists);
                tacklesLabel.setText("Tackles: " + defender.Tackles);
                gamesLabel.setText("Games: " + defender.Games);
            } else {
                seasonsLabel.setText(seasonsLabel.getText() + defender.EndCareer());
                oneSeasonButton.setDisable(true);
                wholeCareerButton.setDisable(true);
            }

        }


    }
    
    public void wholeCareerPlay() {
        if("Forward".equals(SFC.Role)) {
            while(forward.Age <= forward.MAX_AGE) {
                oneSeasonPlay();
                if(forward.Age == forward.MAX_AGE) {
                    seasonsLabel.setText(seasonsLabel.getText() + forward.EndCareer());
                    oneSeasonButton.setDisable(true);
                    wholeCareerButton.setDisable(true);
                }
            }
            
        } else if("Midfielder".equals(SFC.Role)) {
            while(midfielder.Age <= midfielder.MAX_AGE) {
                oneSeasonPlay();
                if(midfielder.Age == midfielder.MAX_AGE) {
                    seasonsLabel.setText(seasonsLabel.getText() + midfielder.EndCareer());
                    oneSeasonButton.setDisable(true);
                    wholeCareerButton.setDisable(true);
                }
            }

        } else if("Defender".equals(SFC.Role)) {
            while(defender.Age <= defender.MAX_AGE) {
                oneSeasonPlay();
                if(defender.Age == defender.MAX_AGE) {
                    seasonsLabel.setText(seasonsLabel.getText() + defender.EndCareer());
                    oneSeasonButton.setDisable(true);
                    wholeCareerButton.setDisable(true);
                }
            }
            
            
        }    
    }
    
}
