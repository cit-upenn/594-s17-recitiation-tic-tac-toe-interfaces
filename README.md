#CIT 594 - Recitation #2
#Tic-Tac-Toe with Interfaces

Look through the files and implement the game using the interfaces. There’s a RandomPlayer implementation you can use to get started on the game logic.

##Files
*  Game.java - Interface to run game
* Player.java - Interface for playing turns
* RandomPlayer.java - Sample Player implementation
* Mark.java - Indicates the location of an X or O mark on the board
* *IllegalTurnException.java - Thrown by Game if player makes invalid move

##Tips
The Game interface throws an exception if a player makes an illegal move. This means your game will have to check the legality of all moves. If you’re unsure about exception handling, one of the TAs can help.

There are few conditions you’ll want to check before and after calling each player’s doTurn method. What are they?

