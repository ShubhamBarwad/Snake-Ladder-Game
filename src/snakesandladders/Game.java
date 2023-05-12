package snakesandladders;

import java.util.ArrayList;

public class Game {
	Board board;
	ArrayList<Player> players =new ArrayList<>();
	ArrayList<Integer> playerPositions = new ArrayList<>();
	Dice d;
	Player winner = null;
	
	public Game(Board board) {
		this.board = board;
		winner = null;
	}
	
	public void addPlayer(Player p) {
		this.players.add(p);
		this.playerPositions.add(0);
	}
	
	public int move(Player p, int playerIndex, int increment) {
		int currentPostition = playerPositions.get(playerIndex);
		System.out.println(p.name +" : "+ currentPostition +" : "+ increment);
		if((currentPostition + increment) <= 100) {
			currentPostition = currentPostition + increment;
		}
		if(this.board.isCurrentPostitionSnakeOrLadder(currentPostition) != -1) {
			currentPostition = this.board.isCurrentPostitionSnakeOrLadder(currentPostition);
		}
		
		playerPositions.set(playerIndex, currentPostition);
		return currentPostition;
	}
	
	public void start() {
		while(this.winner == null) {
			for(int i = 0; i < this.players.size(); i++) {
				Player p = this.players.get(i);
				int position = this.move(p, i, Dice.throwDice());
				if(position >= 100) {
					this.winner = p;
					break;
				}
			}
		}
		System.out.println(this.winner.name+" won!");
	}
}
