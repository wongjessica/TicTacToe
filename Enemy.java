public class Enemy{
    
    private Board board;
    private int space;
    private char enemyLetter;
    
    public Enemy(){ }
    
    public Enemy(Board board){
        this.board = board;
    }
    
    public void turn(){
        do{
            space = (int)(Math.random() * 9);
            System.out.println("Enemy (letter "+ enemyLetter +") setting space at " + (space+1) + ".");
        }while(!board.notOccupied(space));
        System.out.println("Setting Space");
        board.setSpace(space, enemyLetter);
        System.out.println("Player 2 turn over. Displying the board.");
        board.displayBoard();
    }
    
    public char getLetter(){
        return this.enemyLetter;
    }
    
    public void setLetter(char letter){
        //set enemy letter
        switch(letter){
        case 'X':
            enemyLetter = 'O';
            break;
        case 'O':
            enemyLetter = 'X';
            break;
        default:
            System.out.println("Error! Letter could not be resolved!"); 
        }
        
    }
}
