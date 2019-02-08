/**
 * 
 * Jessica Wong
 * Anthony Chen
 *  
 * 
 * You will create a tic tac toe game that can be played between two players. 
 * The directions are purposely vague in order for you to develop the game
 * based on what you need. There are a few requirements to this project and the rest is up to you.
 * 1) You must create another class. You game should run in this main method by calling on methods or objects from the other class
 * 2) Your methods and class variables must make sense. You should be able to answer questions like: why did you make that method static?
 * 3) The game is played by two human players who will enter moves through the keyboard
 * 4) Your game should work and should work intuitively (add text, add functionality, add choice)
 * 5) Your game board must be formed by a 2d array. You should print the board after every move.
 * 6) Your program must contain author rem, method headers, and line rems,
 * 7) Extra Credit(10 points): In addition to the human players, add an option to play against the computer.
 * 
 * 
 * Some methods you may need:
 * 1) print the gameboard
 * 2) change the player
 * 3) get the player's move
 * 4) check the validity of the player's move
 * 5) check for win conditions
 * 
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
    
    System.out.println("If you want to play against a bot then type in Y. If not then type in anything else.");
    Scanner mode= new Scanner(System.in);
    
        if (mode.next().charAt(0) == 'Y'){
        new Game().run();
        }
        
        else{
        new Game2().run();
        }
        
    }
}
