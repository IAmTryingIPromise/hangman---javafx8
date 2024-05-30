/*
this controller sets up the confirmation box when the plays presses exit
inside the main game
*/
package Hangman;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


public class MainMenuConfirmBoxController implements Initializable {

    @FXML
    private AnchorPane anchorPane2;
    @FXML
    private Button btnYes;
    @FXML
    private Button btnNo;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    /*
    if the player pressed yes
    it gets him to the main menu
    */
    @FXML
    private void btnYesClicked(ActionEvent event) {
        HangManController.onClick.play();
        GameSceneController.confrmStage.close();
        Hangman.stage.setScene(Hangman.main);
    }
    
    
    /*
    if the player presses no
    is closes the window
    */
    @FXML
    private void btnNoClicked(ActionEvent event) {
        HangManController.onClick.play();
        GameSceneController.confrmStage.close();
    }
    
    
    /*
    plays the hover over sound for the buttons
    */
    @FXML
    private void btnHovered(MouseEvent event) {
        HangManController.onHover.play();
    }
    
}