import java.util.Scanner;
 
public class Player{
    private char playerLetter;
    private int space;
    private Board board;
    Scanner input = new Scanner(System.in);
    
    public Player(){ }
    
    public Player(Character playerLetter, Board board){
        this.playerLetter = playerLetter;
        this.board = board;
    }
    
    public void turn(){
        System.out.print("It is your turn. ");
        do{
            System.out.print("Where would you like to set your mark (Enter 1 - 9): ");
            space = input.nextInt();
        } while (!board.notOccupied((space-1))); //if space != '-'
        
        board.setSpace((space-1), playerLetter);
            
        System.out.println("Space set. Turn Over, displaying the board.");
        board.displayBoard();
    }
    
    public char getLetter(){
        return this.playerLetter;
    }
    
    public boolean isValidLetter(char letter){
        return (letter == 'O' ^ letter == 'X');
    }
}
