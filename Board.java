public class Board {
    private char[] board = new char[9];
    
    public Board(){ }
    
    public void displayBoard(){
        System.out.println("[ " + board[0] + " ]" + "[ " + board[1] + " ]" + "[ " + board[2] + " ]");
        System.out.println("[ " + board[3] + " ]" + "[ " + board[4] + " ]" + "[ " + board[5] + " ]");
        System.out.println("[ " + board[6] + " ]" + "[ " + board[7] + " ]" + "[ " + board[8] + " ]");
        System.out.println();
    }
    
    public void setSpace(int space, char letter){
        board[space] = letter;
    }
    
    public char getSpace(int space){
        return this.board[space];
    }
    
    public boolean notOccupied(int space){
        return (board[space] == '-'); //true if space contains "-"
    }
    
    public void clear(){
        //clear the board
        for(int i = 0; i < 9; i++){
            board[i] = '-';
        }
    }
    
    public boolean checkGame(Board board){ //check when game over
        int total = 0;
        //Check rows for 3 X or O in a row
        for(int i = 0; i < 3; i++){ //row 1
            total += (int)board.getSpace(i);
            if(total == 237 || total == 264)
                return true;
        }
        total = 0;
        for(int i = 3; i < 6; i++){ //row 2
            total += (int)board.getSpace(i);
            if(total == 237 || total == 264)
                return true;
        }
        total = 0;
        for(int i = 6; i < 9; i++){ //row 3
            total += (int)board.getSpace(i);
            if(total == 237 || total == 264)
                return true;
        }
        total = 0;
        //Check columns for 3 X or O in a row
        for(int i = 0; i < 7; i += 3){ //column 1
            total += (int)board.getSpace(i);
            if(total == 237 || total == 264)
                return true;
        }
        total = 0;
        for(int i = 1; i < 8; i += 3){ //column 2
            total += (int)board.getSpace(i);
            if(total == 237 || total == 264)
                return true;
        }
        total = 0;
        for(int i = 2; i < 10; i += 3){ //column 3
            total += (int)board.getSpace(i);
            if(total == 237 || total == 264)
                return true;
        }
        total = 0;
        //check diagonal-right for 3 X or O in a row
        for(int i = 0; i < 10; i += 4){
            total += (int)board.getSpace(i);
            if(total == 237 || total == 264)
                return true;
        }
        total = 0;
        //check diagonal-left for 3 X or O in a row
        for(int i = 2; i < 7; i += 2){
            total += (int)board.getSpace(i);
            if(total == 237 || total == 264)
                return true;
        }
        total = 0;
        
        return false; //Default
    }
}
