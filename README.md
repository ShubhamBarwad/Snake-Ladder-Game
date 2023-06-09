# Snake-Ladder-Game

# Snake & Ladder Game using Core Java

This is a simple console-based implementation of the popular game Snake and Ladder built using Core Java. The game supports multiple players and random dice rolls. The objective of the game is to be the first player to reach the end of the board by climbing ladders and avoiding snakes.

## Installation and Usage

1. Clone the repository: `git clone https://github.com/your-username/Snake-Ladder-Game.git`
2. Navigate to the project directory: cd Snake-Ladder-Game
3. Compile the Java files: javac *.java
4. Run the game: java Main

## Gameplay

1. The game starts by prompting the user to enter the number of players.
2. Each player takes turns rolling a six-sided dice. The number on the dice determines the number of steps the player can move on the board.
3. If a player lands on a ladder, they move up to the square at the top of the ladder.
4. If a player lands on a snake, they move down to the square at the tail of the snake.
5. The first player to reach the end of the board wins the game.

## Implementation Details

The game is built using Core Java and follows the object-oriented programming paradigm. The main classes and their responsibilities are as follows:

###Game
The Game class represents the actual flow of the game. It contains the functionalities to add player, set the board, move the player depending upon the dice output and even recognize and declare the winner.

### Board
The Board class represents the game board and its properties. It contains the number of squares on the board, the positions of the ladders and snakes, and the current positions of the players.

### Player
The Player class represents a player in the game. It contains the player's name and current position on the
board

### Dice
The Dice class represents the dice used in the game. It generates a random number between 1 and 6 when rolled.

### Main
The Main class contains the main method and is responsible for starting the game. It prompts the user for the number of players and initializes the game board and players. It then runs the game loop until a player reaches the end of the board.

### Ladder
The Ladder class represents the ladder that are present on the board. This class is used to define the start and end points of the ladder.

### Snake
The snake class is used to represent the sankes that are present on the board. Thsi class is used to define the head and the tail of the snakes.

### LadderParameterException
This class is used to creata a userdefined exception that will throw a LadderParameterException when the start of the ladder is greater then the end of the same.

### SnakeParameterException
This class is used to create a userdefined exception that will throw a SnakeParameterException when the head of the snake is lower than the tail of the same.

## Conclusion
This Snake and Ladder game implementation using Core Java is a fun and interactive way to practice object-oriented programming concepts and Java syntax. The game is easy to install and run, and can be easily modified and customized to suit individual preferences.
