public class runner {
    public static void main(String[] args){
        tokenPass testGame= new tokenPass(10);
        int [] testBoard= testGame.getBoard();
        System.out.println("Constructed a test board: ");
        for (int i=0; i<testBoard.length; i++){
            System.out.print(testBoard[i]+"");
        }
        System.out.println();
        testGame.distributeCurrentPlayerTokens();
        System.out.println("After distributing tokens for player " + testGame.getCurrentPlayer()+ ": ");
        for (int i=0; i<testBoard.length; i++){
            System.out.print(testBoard[i]+ " ");
        }
    }
}
