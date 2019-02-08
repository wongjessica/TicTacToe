import java.util.Scanner;
 
public class Game {
    //private variables
    private boolean isGameOver;
    private Player player;
    private Enemy enemy;
    private Board board = new Board();
    //public variables
    Scanner input = new Scanner(System.in);
    
    Game() { 
        isGameOver = false; //default game state
    }
    
    //**ENTRY POINT TO MAIN GAME**
    public void run() {
        do{
            do{
                //get a player letter
                System.out.print("What letter would you like to be (X or O): ");
                player = new Player(input.next().charAt(0), board);
            }while(!player.isValidLetter(player.getLetter()));
            //pass the board to the enemy
            enemy = new Enemy(board);
            enemy.setLetter(player.getLetter()); //set enemy letter to the opposite
            System.out.println("You are letter " + player.getLetter() + ". The enemy is letter " + enemy.getLetter() + ".");
            System.out.println();
            board.clear(); 
            board.displayBoard();
            
            //MAIN LOOP!**
            while(!isGameOver){ //while game is not over
                player.turn();
                if(board.checkGame(board) == true){
                    board.displayBoard();
                    System.out.println("You won!!");
                    break;
                }
                enemy.turn();
                if(board.checkGame(board) == true){
                    board.displayBoard();
                    System.out.println("The enemy won!! You suck!");
                    break;
                }
            }
            System.out.println("Game Over!");
            System.out.println("If you want to play again then type in Y. If not then type in anything else.(press enter twice. Honestly don't know the problem here)");
            if(input.next().charAt(0) == 'y'|| input.next().charAt(0) == 'Y'){
            }
            else{
            isGameOver = true;
            break;
            }
        } while(!isGameOver);
    }
}
