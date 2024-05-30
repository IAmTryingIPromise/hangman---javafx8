/*
this is the main game controller for the main menu of the game
and the set up for the main game to be ready
*/
package Hangman;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.AudioClip;


public class HangManController extends GameSceneController implements Initializable {
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // calls the load choice box method
        loadChoiceBox();
        numOfWordsBox.setValue("6");
        // initializes the sound effect files
        onHover = new AudioClip(new File(path1).toURI().toString());
        onClick = new AudioClip(new File(path).toURI().toString());
        // fxml variable equal to static varible
        sNumOfWordsBox = numOfWordsBox;
    }  
    
        
    @FXML
    private AnchorPane anchorPane;
    
    private Button btn1;
    @FXML
    private Button btnSet;
    @FXML
    private Button btnQui;
    @FXML
    private Button btnStart;
    
    
    /* 
    the file for the sound of buttons being clicked
    */
    String path = "onClickSound.wav";
    static AudioClip onClick;
    
    
    /* 
    the file for the sound of buttons being hovered over
    */
    String path1 = "onHoverSound.wav";
    static AudioClip onHover;
    

    /*
    making the choice box for the number of letters
    */
    @FXML
    private ChoiceBox<String> numOfWordsBox;
    public static ChoiceBox<String> sNumOfWordsBox;
    ObservableList list = FXCollections.observableArrayList();
    
    
    /*
    goes to the settings
    */
    @FXML
    private void btnSettingsAct(ActionEvent event){
        onClick.play();
        Hangman.stage.setScene(Hangman.settings);
    }

    
    /*
    quits and closes the game
    */
    @FXML
    private void btnQuitAct(ActionEvent event) {
        onClick.play();
        Platform.exit();
    }

    
    /*
    starts the game / a new game
    */
    @FXML
    private void btnStartAct(ActionEvent event) throws IOException {
        onClick.play();
        playAgain();
    }

    
    /*
    the following play the sound for when their buttons get hovered over
    these four methods can be made into one
    */
    @FXML
    private void btnSettingsHover(MouseEvent event) {
        onHover.play();
    }

    @FXML
    private void btnQuitHover(MouseEvent event) {
        onHover.play();
    }

    @FXML
    private void btnStartHover(MouseEvent event) {
        onHover.play();
    }
    
    @FXML
    private void choiceBoxSound(MouseEvent event) {
        onHover.play();
    }
    
    
    /*
    loads the choice box when the game is first started 
    */
    private void loadChoiceBox() {
        list.removeAll(list);
        String choices[] = { "4", "5", "6", "7", "8", "9", "10" };
        list.addAll((Object[]) choices);
        numOfWordsBox.getItems().addAll(list);
    }
    
    
    /*
    this method sets up the game to be able to be played again from the beginning
    */
    public static void playAgain() throws IOException {
        int amount = Integer.parseInt(sNumOfWordsBox.getValue());
        String useWord = WordDecider.theWord(amount);
        WordDecider.visibleLines(amount);
        WordDecider.visibleLetters(amount);
        wordDisplay(useWord);
        GameSceneController.resetGame();
        Hangman.stage.setScene(Hangman.game);
    }
}