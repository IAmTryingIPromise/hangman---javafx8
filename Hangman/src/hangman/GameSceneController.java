/*
this is the controller for the actual game
this controls everything that happens while the player plays the game
*/
package Hangman;

import java.io.IOException;
import static java.lang.String.valueOf;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class GameSceneController implements Initializable {
    
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private GridPane btnsGridPane;
    
    
    /*
    every variable that is being used has two diffrent insances in this controller
    one refers to the id from the fxml file
    and the other one is the static one so the variable will be able to be used from the methods
    in this controller
    */
    
    /*
    these are the variables for all the buttons
    */
    @FXML
    private Button btnA;
    public static Button sbtnA;
    @FXML
    private Button btnB;
    public static Button sbtnB;
    @FXML
    private Button btnC;
    public static Button sbtnC;
    @FXML
    private Button btnD;
    public static Button sbtnD;
    @FXML
    private Button btnE;
    public static Button sbtnE;
    @FXML
    private Button btnF;
    public static Button sbtnF;
    @FXML
    private Button btnG;
    public static Button sbtnG;
    @FXML
    private Button btnH;
    public static Button sbtnH;
    @FXML
    private Button btnI;
    public static Button sbtnI;
    @FXML
    private Button btnJ;
    public static Button sbtnJ;
    @FXML
    private Button btnK;
    public static Button sbtnK;
    @FXML
    private Button btnL;
    public static Button sbtnL;
    @FXML
    private Button btnM;
    public static Button sbtnM;
    @FXML
    private Button btnN;
    public static Button sbtnN;
    @FXML
    private Button btnO;
    public static Button sbtnO;
    @FXML
    private Button btnP;
    public static Button sbtnP;
    @FXML
    private Button btnQ;
    public static Button sbtnQ;
    @FXML
    private Button btnR;
    public static Button sbtnR;
    @FXML
    private Button btnS;
    public static Button sbtnS;
    @FXML
    private Button btnT;
    public static Button sbtnT;
    @FXML
    private Button btnU;
    public static Button sbtnU;
    @FXML
    private Button btnV;
    public static Button sbtnV;
    @FXML
    private Button btnW;
    public static Button sbtnW;
    @FXML
    private Button btnX;
    public static Button sbtnX;
    @FXML
    private Button btnY;
    public static Button sbtnY;
    @FXML
    private Button btnZ;
    public static Button sbtnZ;
    @FXML
    private Button btnExit;

    
    /*
    the stage variables for the
    confirmation box
    win stage
    lose stage
    */
    static Stage confrmStage;
    static Stage endStage;
    static Stage lostStage;
    
    
    /*
    the varibales that make stick man figure appear when the player
    wrongly guesses a letter
    */
    @FXML
    private Circle stickmanHead;
    public static Circle sStickmanHead;
    @FXML
    private Line stickmanBody;
    public static Line sStickmanBody;
    @FXML
    private Line stickmanLeftArm;
    public static Line sStickmanLeftArm;
    @FXML
    private Line stickmanRightArm;
    public static Line sStickmanRightArm;
    @FXML
    private Line stickmanLeftLeg;
    public static Line sStickmanLeftLeg;
    @FXML
    private Line stickmanRightLeg;
    public static Line sStickmanRightLeg;
    
    
    /*
    the variables that make the lines under the letters
    */
    @FXML
    private Line line1;
    public static Line ln1;
    @FXML
    private Line line2;
    public static Line ln2;
    @FXML
    private Line line3;
    public static Line ln3;
    @FXML
    private Line line4;
    public static Line ln4;
    @FXML
    private Line line5;
    public static Line ln5;
    @FXML
    private Line line6;
    public static Line ln6;
    @FXML
    private Line line7;
    public static Line ln7;
    @FXML
    private Line line8;
    public static Line ln8;
    @FXML
    private Line line9;
    public static Line ln9;
    @FXML
    private Line line10;
    public static Line ln10;
    
    
    /*
    the variables for the letters itselves
    they are seperate label fields
    one for every possible letter of the words
    */
    @FXML
    private Label lt1;
    public static Label slt1;
    @FXML
    private Label lt2;
    public static Label slt2;
    @FXML
    private Label lt3;
    public static Label slt3;
    @FXML
    private Label lt4;
    public static Label slt4;
    @FXML
    private Label lt5;
    public static Label slt5;
    @FXML
    private Label lt6;
    public static Label slt6;
    @FXML
    private Label lt7;
    public static Label slt7;
    @FXML
    private Label lt8;
    public static Label slt8;
    @FXML
    private Label lt9;
    public static Label slt9;
    @FXML
    private Label lt10;
    public static Label slt10;
    
    
    /*
    variable to count the wrong guesses
    used by a method
    */
    public static int wGuess;
    
    
    /*
    variable to see if the player has won
    used by a funciton
    */
    public static int hasWon;
    
    
    /*
    the initialize method which sets all the static variables to be the same
    with all the fxml variables
    so they can be used by the methods
    */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ln1 = line1; ln2 = line2; ln3 = line3; ln4 = line4; ln5 = line5;
        ln6 = line6; ln7 = line7; ln8 = line8; ln9 = line9; ln10 = line10;
        slt1 = lt1; slt2 = lt2; slt3 = lt3; slt4 = lt4; slt5 = lt5;
        slt6 = lt6; slt7 = lt7; slt8 = lt8; slt9 = lt9; slt10 = lt10; 
        sStickmanHead = stickmanHead; sStickmanBody = stickmanBody;
        sStickmanLeftArm = stickmanLeftArm; sStickmanRightArm = stickmanRightArm;
        sStickmanLeftLeg = stickmanLeftLeg; sStickmanRightLeg = stickmanRightLeg;
        sbtnA = btnA; sbtnB = btnB; sbtnC = btnC; sbtnD = btnD; sbtnE = btnE; sbtnF = btnF;
        sbtnG = btnG; sbtnH = btnH; sbtnI = btnI; sbtnJ = btnJ; sbtnK = btnK; sbtnL = btnL;
        sbtnM = btnM; sbtnN = btnN; sbtnO = btnO; sbtnP = btnP; sbtnQ = btnQ; sbtnR = btnR;
        sbtnS = btnS; sbtnT = btnT; sbtnU = btnU; sbtnV = btnV; sbtnW = btnW; sbtnX = btnX;
        sbtnY = btnY; sbtnZ = btnZ;
    }
    
    
    /*
    the btnExitAct method creates a pop up window for when the player clicks
    the exit button in the game
    it prompts the player to confirm if he wants to exit the game or not
    */
    @FXML
    private void btnExitAct(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MainMenuConfirmBox.fxml"));
        Scene scene1 = new Scene(root);
        confrmStage = new Stage();
        confrmStage.setTitle("Are you sure you want to continue?");
        confrmStage.setScene(scene1);
        confrmStage.showAndWait();
    }
    
    
    /*
    this method takes as an argument the word of the current game and displays
    the first and last letter or that word
    */
    public static void wordDisplay(String word) {
        slt1.setText(null); slt2.setText(null); slt3.setText(null);
        slt4.setText(null); slt5.setText(null); slt6.setText(null);
        slt7.setText(null); slt8.setText(null); slt9.setText(null);
        slt10.setText(null);
        slt1.setText(word.substring(0,1).toUpperCase());
        switch (word.length()) {
            case 4:
                slt4.setText(word.substring(word.length() - 1).toUpperCase());
                break;
            
            case 5:
                slt5.setText(word.substring(word.length() - 1).toUpperCase());
                break;
            
            case 6:
                slt6.setText(word.substring(word.length() - 1).toUpperCase());
                break;
            
            case 7:
                slt7.setText(word.substring(word.length() - 1).toUpperCase());
                break;
            
            case 8:
                slt8.setText(word.substring(word.length() - 1).toUpperCase());
                break;
            
            case 9:
                slt9.setText(word.substring(word.length() - 1).toUpperCase());
                break;
            
            case 10:
                slt10.setText(word.substring(word.length() - 1).toUpperCase());
                break;
            
            default:
                break;
            
        }
    }
    
    
    /*
    plays a sound every time a button in the game scene is hovered by the mouuse
    */
    @FXML
    private void btnLetterHover(MouseEvent event) {
        HangManController.onHover.play();
    }
    
    
    /*
    the following methods check if any letter that the player clicks is correct
    or not, and acts accordingly
    either displaying it on the screen(correct choice) or draws a part of the stick man (wrong choice)
    */
    @FXML
    private void btnAAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnA.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("a".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnBAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnB.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("b".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnCAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnC.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("c".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnDAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnD.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("d".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnEAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnE.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("e".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnFAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnF.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("f".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnGAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnG.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("g".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnHAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnH.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("h".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnIAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnI.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("i".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnJAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnJ.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("j".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnKAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnK.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("k".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnLAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnL.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("l".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnMAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnM.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("m".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnNAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnN.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("n".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnOAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnO.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("o".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnPAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnP.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("p".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnQAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnQ.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("q".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnRAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnR.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("r".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnSAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnS.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("s".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnTAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnT.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("t".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnUAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnU.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("u".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnVAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnV.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("v".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnWAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnW.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("w".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnXAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnX.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("x".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnYAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnY.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("y".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }

    @FXML
    private void btnZAct(ActionEvent event) throws IOException {
        boolean notFound = true;
        btnZ.setDisable(true);
        String parseWord = WordDecider.theWord;
        for (int i = 1; i < parseWord.length() - 1; i++) {
            char c = parseWord.charAt(i);
            if (valueOf(c).toUpperCase().equals("z".toUpperCase())) {
                WordDecider.showCorrectLetter(i,c);
                notFound = false;
            }
        }
        if (notFound) {
            wrongGuess();
        }
        hasWon(hasWon);
    }
    
    
    /*
    the wrongGuess funtion counts the wrong guesses of the current game
    and displays the appropriate part of the stick man
    and when the stick man is completely drawn it displays the game over scene
    */
    private void wrongGuess() throws IOException {
        wGuess += 1;
        switch (wGuess) {
            case(1):
                sStickmanHead.setVisible(true);
                break;
            
            case(2):
                sStickmanBody.setVisible(true);
                break;
            
            case(3):
                sStickmanRightArm.setVisible(true);
                break;
            
            case(4):
                sStickmanLeftArm.setVisible(true);
                break;
            
            case(5):
                sStickmanRightLeg.setVisible(true);
                break;
            
            case(6):
                sStickmanLeftLeg.setVisible(true);
                hasWonOrLost();
                Parent root = FXMLLoader.load(getClass().getResource("LoseScene.fxml"));
                Scene lostScene = new Scene(root);
                lostStage = new Stage();
                lostStage.setTitle("You Lost");
                lostStage.setScene(lostScene);
                LoseSceneController.slblTheWord.setText(WordDecider.theWord.toUpperCase());
                lostStage.showAndWait();
                break;
            
            default:
                break;
            
        }
    }
    
    
    /*
    the resetGame fuction resets the game to its default state getting it ready for a new round
    */
    public static void resetGame() {
        hasWon = 0;
        wGuess = 0;
        sStickmanHead.setVisible(false); sStickmanBody.setVisible(false); sStickmanLeftArm.setVisible(false);
        sStickmanRightArm.setVisible(false); sStickmanLeftLeg.setVisible(false); sStickmanRightLeg.setVisible(false);
        sbtnA.setDisable(false); sbtnB.setDisable(false); sbtnC.setDisable(false);
        sbtnD.setDisable(false); sbtnE.setDisable(false); sbtnF.setDisable(false);
        sbtnG.setDisable(false); sbtnH.setDisable(false); sbtnI.setDisable(false);
        sbtnJ.setDisable(false); sbtnK.setDisable(false); sbtnL.setDisable(false);
        sbtnM.setDisable(false); sbtnN.setDisable(false); sbtnO.setDisable(false);
        sbtnP.setDisable(false); sbtnQ.setDisable(false); sbtnR.setDisable(false);
        sbtnS.setDisable(false); sbtnT.setDisable(false); sbtnU.setDisable(false);
        sbtnV.setDisable(false); sbtnW.setDisable(false); sbtnX.setDisable(false);
        sbtnY.setDisable(false); sbtnZ.setDisable(false);
    }
    
    
    /*
    the hasWon method takes are argument the amount of letters the player has found
    and checks if the player has won 
    */
    private void hasWon(int lettersFound) throws IOException {
        if (lettersFound == (WordDecider.theWord.length() - 2)) {
            hasWonOrLost();
            Parent root = FXMLLoader.load(getClass().getResource("WinScene.fxml"));
            Scene endScene = new Scene(root);
            endStage = new Stage();
            endStage.setTitle("Congratulations!");
            endStage.setScene(endScene);
            endStage.showAndWait();
        }
    }
    
    
    /*
    the hasWonOrLost method disables all the letter buttons every time the player
    wins or loses the game
    */
    private void hasWonOrLost(){
        sbtnA.setDisable(true); sbtnB.setDisable(true); sbtnC.setDisable(true);
        sbtnD.setDisable(true); sbtnE.setDisable(true); sbtnF.setDisable(true);
        sbtnG.setDisable(true); sbtnH.setDisable(true); sbtnI.setDisable(true);
        sbtnJ.setDisable(true); sbtnK.setDisable(true); sbtnL.setDisable(true);
        sbtnM.setDisable(true); sbtnN.setDisable(true); sbtnO.setDisable(true);
        sbtnP.setDisable(true); sbtnQ.setDisable(true); sbtnR.setDisable(true);
        sbtnS.setDisable(true); sbtnT.setDisable(true); sbtnU.setDisable(true);
        sbtnV.setDisable(true); sbtnW.setDisable(true); sbtnX.setDisable(true);
        sbtnY.setDisable(true); sbtnZ.setDisable(true);
    }
}