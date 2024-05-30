/*
this is the controller for the game over scene
it comes up when the player loses
*/
package savvaskotzamanidisjavafx210055;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


public class LoseSceneController implements Initializable {

    @FXML
    private Button btnTryAgain;
    @FXML
    private Button btnMainMenu;
    @FXML
    private Label lblTheWord;
    
    public static Label slblTheWord;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        slblTheWord = lblTheWord;
    }    

    
    /* 
    this plays the sound for when the buttons are hovered over with the mouse
    */
    @FXML
    private void btnHovered(MouseEvent event) {
        HangManController.onHover.play();
    }

    
    /*
    the following allow the player to try again after he loses
    or to go to the main menu
    */
    @FXML
    private void btnTryAgainAct(ActionEvent event) throws IOException {
        HangManController.onClick.play();
        GameSceneController.lostStage.close();
        HangManController.playAgain();
    }

    @FXML
    private void btnMainMenuAct(ActionEvent event) {
        HangManController.onClick.play();
        GameSceneController.lostStage.close();
        SavvasKotzamanidisJavaFX210055.stage.setScene(SavvasKotzamanidisJavaFX210055.main);
    }
    
}