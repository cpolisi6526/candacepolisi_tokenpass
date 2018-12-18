public class tokenPass {
    private int[] board;
    private int currentPlayer;
    public tokenPass(int playerCount){
        this.board= new int[playerCount];
        this.currentPlayer= (int) (Math.random()*playerCount-1);
        for (int c=0; c<playerCount; c++){
            this.board[c]= (int) (Math.random()*10)+1;
        }
    }
    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public int[] getBoard() {
        return board;
    }

    public void distributeCurrentPlayerTokens(){
        board[currentPlayer]= 0;
        int c= currentPlayer+1;
        for (int tokens= board[currentPlayer]; tokens>0;tokens--){
            if (c>board.length){
               c=0;
            }
            board[c]+=1;
            c++;
        }
    }
}
