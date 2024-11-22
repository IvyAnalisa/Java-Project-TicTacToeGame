public class GameBoard {
    private char[][] board; // declare 2D array to represent the game board
    private static final int SIZE = 3; // Board size (3x3)
    private static final char EMPTY = ' '; // Placeholder for empty cells

    //Constructor to initialize the board
    public GameBoard() {
        board = new char[SIZE][SIZE];
        //nest loop . Row are indexed as 0,1,2. Column are indexed as 0,1,2 for a 3x3 board
        // for i=0 (first row), j loop through column 0,1,2
        //for i =1 (second row). j loop through column 0,1,2
        // for i =2 (third row), j loop through column 0,1,2
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    // Method to display the game board
    public void displayBoard() {
        System.out.println();// add a blank line before displaying the board
        //outer loop
        for (int i = 0; i < SIZE; i++) {
            //inner loop
            for (int j = 0; j < SIZE; j++) {
                System.out.print(" " + board[i][j] + " ");
                //add a vertical divider between cells in the same row, but not after the last cell row
                if (j < SIZE - 1) {
                    System.out.print("|"); // Vertical divider
                }
            }
            System.out.println();
            // //add a horizontal divider between cells in the same row, but not after the last cell row
            if (i < SIZE - 1) {
                System.out.println("---+---+---"); // Horizontal divider
            }
        }
        System.out.println();
    }
    // Method to place a marker (X or O) on the board
    public boolean placeMarker(int row, int col, char marker) {
        if (row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == EMPTY) {
            board[row][col] = marker;
            return true; // Move successful
        }
        return false; // Move invalid
    }

    //Method to check the winner
    public boolean checkWin(char marker) {
        // Check rows
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] == marker && board[i][1] == marker && board[i][2] == marker) {
                return true;// winning condition: 3 markers in the same row
            }
        }

        // Check columns
        for (int j = 0; j < SIZE; j++) {
            if (board[0][j] == marker && board[1][j] == marker && board[2][j] == marker) {
                return true;// winning condition: 3 markers in the same column
            }
        }

        // Check diagonals
        if (board[0][0] == marker && board[1][1] == marker && board[2][2] == marker) {
            return true;
        }
        if (board[0][2] == marker && board[1][1] == marker && board[2][0] == marker) {
            return true;
        }

        return false;
    }
    // method checking if the board game is completely filled , no empty cell left
    public boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
    // method for reset  the game after player win or 2 players get draw
    public void resetBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
    }
}

