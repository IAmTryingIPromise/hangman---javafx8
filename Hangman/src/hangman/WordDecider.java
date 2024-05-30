/*
this class picks a random word for the current round of the game
*/
package Hangman;

import java.io.File;
import java.io.IOException;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class WordDecider {
    
    
    /*
    array for the words to be loaded into it
    */
    public static ArrayList<String> list;
    
    
    /*
    for random number generation
    */
    static Random ran = new Random();
    
    
    /*
    the current word of the round
    */
    public static String theWord;
    
    
    /*
    this methos takes the letters of the word and randomly chooses a word for the round
    and returns that word
    */
    public static String theWord(int letters) throws IOException {
        list = new ArrayList<>();
        switch (letters) {
            case 4:
                String path = "letterFour.txt";
                Scanner scan4 = new Scanner(new File(path).toPath());
                while (scan4.hasNextLine()) {
                    list.add(scan4.nextLine());
                }
                scan4.close();
                int num = ran.nextInt(list.size());
                theWord = list.get(num);
                break;
            
            case 5:
                path = "letterFive.txt";
                scan4 = new Scanner(new File(path).toPath());
                while (scan4.hasNextLine()) {
                    list.add(scan4.nextLine());
                }
                scan4.close();
                num = ran.nextInt(list.size());
                theWord = list.get(num);
                break;
            
            case 6:
                path = "letterSix.txt";
                scan4 = new Scanner(new File(path).toPath());
                while (scan4.hasNextLine()) {
                    list.add(scan4.nextLine());
                }
                scan4.close();
                num = ran.nextInt(list.size());
                theWord = list.get(num);
                break;
            
            case 7:
                path = "letterSeven.txt";
                scan4 = new Scanner(new File(path).toPath());
                while (scan4.hasNextLine()) {
                    list.add(scan4.nextLine());
                }
                scan4.close();
                num = ran.nextInt(list.size());
                theWord = list.get(num);
                break;
            
            case 8:
                path = "letterEight.txt";
                scan4 = new Scanner(new File(path).toPath());
                while (scan4.hasNextLine()) {
                    list.add(scan4.nextLine());
                }
                scan4.close();
                num = ran.nextInt(list.size());
                theWord = list.get(num);
                break;
            
            case 9:
                path = "letterNine.txt";
                scan4 = new Scanner(new File(path).toPath());
                while (scan4.hasNextLine()) {
                    list.add(scan4.nextLine());
                }
                scan4.close();
                num = ran.nextInt(list.size());
                theWord = list.get(num);
                break;
            
            case 10:
                path = "letterTen.txt";
                scan4 = new Scanner(new File(path).toPath());
                while (scan4.hasNextLine()) {
                    list.add(scan4.nextLine());
                }
                scan4.close();
                num = ran.nextInt(list.size());
                theWord = list.get(num);
                break;
            
            default:
                break;
            
        }
        return theWord;
    }
    
    
    /*
    shows the appropriate amount of underlines depending on the length of the word
    */
    public static void visibleLines(int amount) {
        GameSceneController.ln1.setVisible(false);
        GameSceneController.ln2.setVisible(false);
        GameSceneController.ln3.setVisible(false);
        GameSceneController.ln4.setVisible(false);
        GameSceneController.ln5.setVisible(false);
        GameSceneController.ln6.setVisible(false);
        GameSceneController.ln7.setVisible(false);
        GameSceneController.ln8.setVisible(false);
        GameSceneController.ln9.setVisible(false);
        GameSceneController.ln10.setVisible(false);
        switch (amount) {
            case 4:
                GameSceneController.ln1.setVisible(true);
                GameSceneController.ln2.setVisible(true);
                GameSceneController.ln3.setVisible(true);
                GameSceneController.ln4.setVisible(true);
                break;
            
            case 5:
                GameSceneController.ln1.setVisible(true);
                GameSceneController.ln2.setVisible(true);
                GameSceneController.ln3.setVisible(true);
                GameSceneController.ln4.setVisible(true);
                GameSceneController.ln5.setVisible(true);
                break;
            
            case 6:
                GameSceneController.ln1.setVisible(true);
                GameSceneController.ln2.setVisible(true);
                GameSceneController.ln3.setVisible(true);
                GameSceneController.ln4.setVisible(true);
                GameSceneController.ln5.setVisible(true);
                GameSceneController.ln6.setVisible(true);
                break;
            
            case 7:
                GameSceneController.ln1.setVisible(true);
                GameSceneController.ln2.setVisible(true);
                GameSceneController.ln3.setVisible(true);
                GameSceneController.ln4.setVisible(true);
                GameSceneController.ln5.setVisible(true);
                GameSceneController.ln6.setVisible(true);
                GameSceneController.ln7.setVisible(true);
                break;
            
            case 8:
                GameSceneController.ln1.setVisible(true);
                GameSceneController.ln2.setVisible(true);
                GameSceneController.ln3.setVisible(true);
                GameSceneController.ln4.setVisible(true);
                GameSceneController.ln5.setVisible(true);
                GameSceneController.ln6.setVisible(true);
                GameSceneController.ln7.setVisible(true);
                GameSceneController.ln8.setVisible(true);
                break;
            
            case 9:
                GameSceneController.ln1.setVisible(true);
                GameSceneController.ln2.setVisible(true);
                GameSceneController.ln3.setVisible(true);
                GameSceneController.ln4.setVisible(true);
                GameSceneController.ln5.setVisible(true);
                GameSceneController.ln6.setVisible(true);
                GameSceneController.ln7.setVisible(true);
                GameSceneController.ln8.setVisible(true);
                GameSceneController.ln9.setVisible(true);
                break;
            
            case 10:
                GameSceneController.ln1.setVisible(true);
                GameSceneController.ln2.setVisible(true);
                GameSceneController.ln3.setVisible(true);
                GameSceneController.ln4.setVisible(true);
                GameSceneController.ln5.setVisible(true);
                GameSceneController.ln6.setVisible(true);
                GameSceneController.ln7.setVisible(true);
                GameSceneController.ln8.setVisible(true);
                GameSceneController.ln9.setVisible(true);
                GameSceneController.ln10.setVisible(true);
                break;
            
            default:
                break;
            
        }
    }
    
    
    /*
    shows the appropriate amount of letter labels depending on the length of the word
    */
    public static void visibleLetters(int amount) {
        GameSceneController.slt1.setVisible(false);
        GameSceneController.slt2.setVisible(false);
        GameSceneController.slt3.setVisible(false);
        GameSceneController.slt4.setVisible(false);
        GameSceneController.slt5.setVisible(false);
        GameSceneController.slt6.setVisible(false);
        GameSceneController.slt7.setVisible(false);
        GameSceneController.slt8.setVisible(false);
        GameSceneController.slt9.setVisible(false);
        GameSceneController.slt10.setVisible(false);
        switch (amount) {
            case 4:
                GameSceneController.slt1.setVisible(true);
                GameSceneController.slt2.setVisible(true);
                GameSceneController.slt3.setVisible(true);
                GameSceneController.slt4.setVisible(true);
                break;
            
            case 5:
                GameSceneController.slt1.setVisible(true);
                GameSceneController.slt2.setVisible(true);
                GameSceneController.slt3.setVisible(true);
                GameSceneController.slt4.setVisible(true);
                GameSceneController.slt5.setVisible(true);
                break;
            
            case 6:
                GameSceneController.slt1.setVisible(true);
                GameSceneController.slt2.setVisible(true);
                GameSceneController.slt3.setVisible(true);
                GameSceneController.slt4.setVisible(true);
                GameSceneController.slt5.setVisible(true);
                GameSceneController.slt6.setVisible(true);
                break;
            
            case 7:
                GameSceneController.slt1.setVisible(true);
                GameSceneController.slt2.setVisible(true);
                GameSceneController.slt3.setVisible(true);
                GameSceneController.slt4.setVisible(true);
                GameSceneController.slt5.setVisible(true);
                GameSceneController.slt6.setVisible(true);
                GameSceneController.slt7.setVisible(true);
                break;
            
            case 8:
                GameSceneController.slt1.setVisible(true);
                GameSceneController.slt2.setVisible(true);
                GameSceneController.slt3.setVisible(true);
                GameSceneController.slt4.setVisible(true);
                GameSceneController.slt5.setVisible(true);
                GameSceneController.slt6.setVisible(true);
                GameSceneController.slt7.setVisible(true);
                GameSceneController.slt8.setVisible(true);
                break;
            
            case 9:
                GameSceneController.slt1.setVisible(true);
                GameSceneController.slt2.setVisible(true);
                GameSceneController.slt3.setVisible(true);
                GameSceneController.slt4.setVisible(true);
                GameSceneController.slt5.setVisible(true);
                GameSceneController.slt6.setVisible(true);
                GameSceneController.slt7.setVisible(true);
                GameSceneController.slt8.setVisible(true);
                GameSceneController.slt9.setVisible(true);
                break;
            
            case 10:
                GameSceneController.slt1.setVisible(true);
                GameSceneController.slt2.setVisible(true);
                GameSceneController.slt3.setVisible(true);
                GameSceneController.slt4.setVisible(true);
                GameSceneController.slt5.setVisible(true);
                GameSceneController.slt6.setVisible(true);
                GameSceneController.slt7.setVisible(true);
                GameSceneController.slt8.setVisible(true);
                GameSceneController.slt9.setVisible(true);
                GameSceneController.slt10.setVisible(true);
                break;
            
            default:
                break;
            
        }
    }
    
    
    /*
    resets the stick man for a new round
    */
    public static void resetGame() {
        GameSceneController.wGuess = 0;
        GameSceneController.sStickmanHead.setVisible(false);
        GameSceneController.sStickmanBody.setVisible(false);
        GameSceneController.sStickmanLeftArm.setVisible(false);
        GameSceneController.sStickmanRightArm.setVisible(false);
        GameSceneController.sStickmanLeftLeg.setVisible(false);
        GameSceneController.sStickmanRightLeg.setVisible(false);
    }
    
    
    /*
    shows the correct letters in the right positions after the player has picked
    that correct letter
    */
    public static void showCorrectLetter(int index, char letter) {
        GameSceneController.hasWon += 1;
        switch (index) {
            case (1):
                GameSceneController.slt2.setText(valueOf(letter).toUpperCase());
                break;
            
            case (2):
                GameSceneController.slt3.setText(valueOf(letter).toUpperCase());
                break;
            
            case (3):
                GameSceneController.slt4.setText(valueOf(letter).toUpperCase());
                break;
            
            case (4):
                GameSceneController.slt5.setText(valueOf(letter).toUpperCase());
                break;
            
            case (5):
                GameSceneController.slt6.setText(valueOf(letter).toUpperCase());
                break;
            
            case (6):
                GameSceneController.slt7.setText(valueOf(letter).toUpperCase());
                break;
            
            case (7):
                GameSceneController.slt8.setText(valueOf(letter).toUpperCase());
                break;
            
            case (8):
                GameSceneController.slt9.setText(valueOf(letter).toUpperCase());
                break;
            
            default:
                break;
            
        }
    }
}