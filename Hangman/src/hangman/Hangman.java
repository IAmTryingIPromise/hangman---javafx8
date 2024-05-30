/*
this is the main executable file for the whole game
*/
package Hangman;

import java.io.File;
import javafx.application.*;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class Hangman extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
    /*
    the varibales for the three main different scenes
    */
    static Scene settings;
    static Scene main;
    static Scene game;
    
    
    /*
    the variable for the main starting stage
    */
    static Stage stage;
    
    
    /*
    the background music for the game
    */
    static String path;
    static Media media;
    static MediaPlayer mediaPlayer;
    
    
    /*
    the start method that makes the game come together
    */
    @Override
    public void start(Stage mainStage) throws Exception {
        
        
        /*
        plays the background music
        */
        path = "bgmusic.wav";
        media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
        
        
        /*
        the starting stage
        */
        stage = mainStage;
        
        
        /*
        fxml calls for each scene
        */
        Parent root = FXMLLoader.load(getClass().getResource("HangManFXML.fxml"));
        Parent root2 = FXMLLoader.load(getClass().getResource("SettingsScene.fxml"));
        Parent root3 = FXMLLoader.load(getClass().getResource("GameScene.fxml"));
        
        
        /*
        the three main scenes
        */
        main = new Scene(root);
        settings = new Scene(root2);
        game = new Scene(root3);

        
        /*
        making the stage and showing the scene(s) to the screen
        */
        mainStage.setTitle("HangedMan Game");
        mainStage.setScene(main);
        mainStage.show();
    }
}