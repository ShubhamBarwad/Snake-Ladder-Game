package snakesandladders;

import java.util.HashMap;

import exceptions.LadderParameterException;
import exceptions.SnakeParameterExeption;

public class Board {
	int cells;
	private HashMap<Integer, Ladder> ladders = new HashMap<Integer, Ladder>();
	private HashMap<Integer, Snake> snakes = new HashMap<Integer, Snake>();
	
	public Board(int size) {
		this.cells = size;
		
		try {
			this.addSnakes(40, 20);
			this.addSnakes(99, 2);
			
			this.addLadders(10, 90);
			this.addLadders(5, 50);
		}catch(Exception e) {
			System.out.println("Error: "+e.toString());
		}
		
	}
	
	public void addLadders(int start, int end) throws LadderParameterException{
		if(start > end) {
			throw new LadderParameterException("Start value should be smaller than the end value");
		}
		this.ladders.put(start, new Ladder(start, end));
	}
	public void addSnakes(int head, int tail) throws SnakeParameterExeption {
		if(tail > head) {
			throw new SnakeParameterExeption("Tail values should be smaller than head");
		}
		this.snakes.put(head, new Snake(head, tail));
	}
	
	public int isCurrentPostitionSnakeOrLadder(int position) {
		if(this.snakes.get(position) != null) {
			System.out.println("Snake is found");
			return this.snakes.get(position).getTail();
		}
		
		if(this.ladders.get(position) != null) {
			System.out.println("Ladder is found");
			return this.ladders.get(position).getEnd();
		}
		
		return -1;
	}
}
