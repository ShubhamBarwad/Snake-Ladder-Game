package snakesandladders;

public class Main {

	public static void main(String[] args) {
		Game g = new Game(new Board(100));
		g.addPlayer(new Player("Shubham"));
		g.addPlayer(new Player("Suyash"));
		
		g.start();

	}

}
