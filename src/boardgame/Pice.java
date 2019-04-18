package boardgame;

public class Pice {
	
	protected Position position;
	protected Board board;
	
	public Pice(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}
	
}
