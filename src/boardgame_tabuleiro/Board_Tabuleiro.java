package boardgame_tabuleiro;

public class Board_Tabuleiro {
	private int rows;
	private int columns; 
	private Piece_Peca [][] pecas;
	
	public Board_Tabuleiro(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pecas = new Piece_Peca [rows] [columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece_Peca peca(int row, int column) {
		return pecas [row] [column];
	}
	
	public Piece_Peca peca(Position_Posicao posicao) {
		return pecas[posicao.getRow_linha()] [posicao.getColumn_coluna()];
	}
}
