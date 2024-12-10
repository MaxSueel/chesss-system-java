package boardgame_tabuleiro;

public class Position_Posicao {

	private int row_linha; // Criando atributos linha
	private int column_coluna; // Criando atributos coluna

	public Position_Posicao(int row_linha, int column_coluna) {
		this.row_linha = row_linha;
		this.column_coluna = column_coluna;
	}

	public int getRow_linha() {
		return row_linha;
	}

	public void setRow_linha(int row_linha) {
		this.row_linha = row_linha;
	}

	public int getColumn_coluna() {
		return column_coluna;
	}

	public void setColumn_coluna(int column_coluna) {
		this.column_coluna = column_coluna;
	}
	
	@Override
	public String toString() {
		return row_linha + " , " + column_coluna;
	}

}
