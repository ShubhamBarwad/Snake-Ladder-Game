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
