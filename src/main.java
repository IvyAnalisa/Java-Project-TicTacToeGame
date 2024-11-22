import java.util.Scanner;

public class main {
    private static Player player1;
    private static Player player2;
    private static Player currentPlayer;
    private static Scanner scanner = new Scanner(System.in); // Declare scanner globally
    private static GameBoard board = new GameBoard();//

    public static void main(String[] args) {

        startGame();

        while (true) {
            board.displayBoard();

            System.out.println("Player " + currentPlayer + ", enter your move (row (1-3); and column (1-3): ");
            int row = scanner.nextInt() - 1; // Convert to 0-based index
            int col = scanner.nextInt() - 1; // Convert to 0-based index

            if (board.placeMarker(row, col, currentPlayer.getMarker())) {
                // Check for a winner. Call method checkWin from Gameboard class
                if (board.checkWin(currentPlayer.getMarker())) {
                    board.displayBoard();// call method displayBoard form Gameboard class
                    System.out.println("Player " + currentPlayer.getName() + " wins!");
                    startGame();// restart to register the player and reset the game
                    continue;// the game restart new after 1 player wins
                }
                // Check for a draw
                if (board.isFull()) {
                    board.displayBoard();
                    System.out.println("It's a draw!");
                    startGame();// restart to register the player and reset the game

                    continue;// the game will restart once draw happen
                }

                // turn between the two player,
                if (currentPlayer == player1) {
                    currentPlayer = player2;
                } else {
                    currentPlayer = player1;
                }

            } else {
                System.out.println("Invalid move. Try again.");
            }


        }



    }
   // Method for register player
   public static void registerPlayer(){
       Scanner scanner = new Scanner(System.in);

       System.out.println("Welcome to Tic Tac Toe game");

       System.out.print("Enter name for Player 1 (X): ");
       String name1 = scanner.nextLine();
        player1 = new Player(name1, 'X');

       System.out.print("Enter name for Player 2 (O): ");
       String name2 = scanner.nextLine();
        player2 = new Player(name2, 'O');//from Player class

        currentPlayer = player1;
   }

   public static void startGame(){
        registerPlayer();
       board.resetBoard();
   }

}







