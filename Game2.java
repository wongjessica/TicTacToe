import java.util.Scanner;
 
public class Game2 {
    //private variables
    private boolean isGameOver;
    private Player player;
    private Player2 player2;
    private Board board = new Board();
    //public variables
    Scanner input = new Scanner(System.in);
    
    Game2() { 
        isGameOver = false; //default game state
    }
    
    //**ENTRY POINT TO MAIN GAME**
    public void run() {
        do{
            do{
                //get a player letter
                System.out.print("What letter would player 1 like to be (X or O): ");
                player = new Player(input.next().charAt(0), board);
            }while(!player.isValidLetter(player.getLetter()));
            //pass the board to the enemy
            player2 = new Player2(board);
            player2.setLetter(player.getLetter()); 
            System.out.println("player 1 is letter " + player.getLetter() + ". player 2 is letter " + player2.getLetter() + ".");
            System.out.println();
            board.clear(); 
            board.displayBoard();
            
            //MAIN LOOP!**
            while(!isGameOver){ //while game is not over
                player.turn();
                if(board.checkGame(board) == true){
                    board.displayBoard();
                    System.out.println("Player 1 has won!!");
                    break;
                }
                player2.turn();
                if(board.checkGame(board) == true){
                    board.displayBoard();
                    System.out.println("PLayer 2 has won!!");
                    break;
                }
            }
            System.out.println("Game Over!");
            System.out.println("If you want to play again then type in Y. If not then type in anything else.(press enter twice. Honestly don't know the problem here)");
            if(input.next().charAt(0) == 'y'|| input.next().charAt(0) == 'Y'){
            }
            else{
            isGameOver = true;
            }
        } while(!isGameOver);
    }
}
