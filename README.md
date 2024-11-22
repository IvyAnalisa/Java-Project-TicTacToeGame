# Java-Project-TicTacToeGame
# Tic Tac Toe Game
#### A simple, text-based Tic Tac Toe game implemented in Java, designed for two human players. This project is an object-oriented approach to building a command-line game
### Features
- 2-player gameplay: Players alternate turns to place their markers (X and O) on the 3x3 grid.
-  Win detection: The game automatically detects when a player wins (horizontal, vertical, or diagonal alignment).
-  Draw detection: The game identifies when the board is full and declares a draw.
-  Restart functionality: After a win or draw, the game resets and asks for player names to start a new match.
- Input validation: Ensures players cannot place markers in already occupied cells
### Project Structure
 Classes
1.Player:
- Represents a player with a name and a marker (X or O).
- Methods to retrieve the player's name and marker.
2. GameBoard
- Manages the 3x3 board as a 2D array.
- Handles board display, marker placement, win/draw checks, and board reset.
3. Main:
- The entry point of the program.
- Coordinates game logic, player turns, and interactions between the Player and GameBoard classes.
### How to play:
- When the game starts, enter the names of Player 1 (X) and Player 2 (O).
- Players take turns entering their moves by specifying the row and column (1-3) where they want to place their marker.
- The game checks after each move for:
+ Win: Declares the player as the winner.
+ Draw: Declares the game as a draw if the board is full.
- After the game ends (win or draw), the game resets and allows players to start a new match.
