package boardgame;

public class Board {

	private int rows;
	private int colunms;
	private Piece[][] pieces;

	public Board(int rows, int colunms) {
		if (rows < 1 || colunms < 1) {
			throw new BoardException("Error Creating board: there must be at least 1 row and 1 column to create");
		}
		this.rows = rows;
		this.colunms = colunms;
		pieces = new Piece[rows][colunms];
	}

	public int getRows() {
		return rows;
	}

	public int getColunms() {
		return colunms;
	}

	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}

	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	public Piece removePiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("position not on the board");
		}
		if (piece(position) == null) {
			return null;
		}

		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return aux;

	}

	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException(" There is already a piece on position" + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < colunms;
	}

	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}

	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}

}
