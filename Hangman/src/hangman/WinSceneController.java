/*
this is the controller for the winning scene
it comes up when the player wins
*/
package Hangman;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


public class WinSceneController implements Initializable {

    @FXML
    private Button playAgainbtn;
    @FXML
    private Button mainMenubtn;
    @FXML
    private Label congatslbl;
    @FXML
    private Label congatslbl1;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    /*
    the following allow the player after he has won 
    to either play again
    or go to the main menu
    */
    @FXML
    private void btnPlayAgainAct(ActionEvent event) throws IOException {
        HangManController.onClick.play();
        GameSceneController.endStage.close();
        HangManController.playAgain();
    }

    @FXML
    private void btnMainMenuAct(ActionEvent event) {
        HangManController.onClick.play();
        GameSceneController.endStage.close();
        Hangman.stage.setScene(Hangman.main);
        
    }

    
    /* 
    this plays the sound for when the buttons are hovered over with the mouse
    */
    @FXML
    private void btnHovered(MouseEvent event) {
        HangManController.onHover.play();
    }
}