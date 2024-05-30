/*
this controller is for the settings scene
*/
package Hangman;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.beans.Observable;
import javafx.scene.input.MouseEvent;



public class SettingsSceneController implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Button btnRet;
    
    
    /*
    the slider for the background music volume
    */
    @FXML
    private Slider musicslide;
    
    
    /*
    the slider for the sound effects volume
    */
    @FXML
    private Slider sfxslide;

   
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        /*
        control the background music volume
        */
        musicslide.setValue(Hangman.mediaPlayer.getVolume() * 100);
        musicslide.valueProperty().addListener((Observable o) -> {
            Hangman.mediaPlayer.setVolume(musicslide.getValue() / 100);
        });
        
        
        /*
        control the sound effects volume
        */
        sfxslide.setValue(HangManController.onHover.getVolume() * 100);
        sfxslide.valueProperty().addListener((Observable o) -> {
            HangManController.onClick.setVolume(sfxslide.getValue() / 100);
            HangManController.onHover.setVolume(sfxslide.getValue() / 100);
        });
    }    
    
    
    /*
    returns the player to the main menu
    */
    @FXML
    private void btnReturnAct(ActionEvent event) {
        HangManController.onClick.play();
        Hangman.stage.setScene(Hangman.main);
    }    
    
    
    /*
    plays the hover over sound for the return button
    */
    @FXML
    private void btnReturnHover(MouseEvent event) {
        HangManController.onHover.play();
    }
}