package boardgame;

public class Board {
	
	private int rows;
	private int colunms;
	private Pice[][] pices;
	public Board(int rows, int colunms, Pice[][] pices) {
		this.rows = rows;
		this.colunms = colunms;
		this.pices = pices;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColunms() {
		return colunms;
	}
	public void setColunms(int colunms) {
		this.colunms = colunms;
	}
	
	

}
