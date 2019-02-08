import java.util.Scanner;
 
public class Player2{
    public char player2Letter;
    private int space;
    private Board board;
    Scanner input = new Scanner(System.in);
    
    public Player2(){ }
    
    public Player2(Board board){
        this.board = board;
    }
    
    public void setLetter(char letter){
        //set player2 letter
        switch(letter){
        case 'X':
            player2Letter = 'O';
            break;
        case 'O':
            player2Letter = 'X';
            break;
        default:
            System.out.println("Error! Letter could not be resolved!"); 
        }
    }
    
    public void turn(){
        System.out.print("It is player 2 turn. ");
        do{
            System.out.print("Where would you like to set your mark (Enter 1 - 9): ");
            space = input.nextInt();
        } while (!board.notOccupied((space-1))); //if space != '-'
        
        board.setSpace((space-1), player2Letter);
            
        System.out.println("Space set. Turn Over, displaying the board.");
        board.displayBoard();
    }
    
    public char getLetter(){
        return this.player2Letter;
    }
    
    public boolean isValidLetter(char letter){
        return (letter == 'O' ^ letter == 'X');
    }
}
