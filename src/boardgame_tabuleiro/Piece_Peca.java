package boardgame_tabuleiro;

public class Piece_Peca {
	
	protected Position_Posicao posicao;
	private Board_Tabuleiro tabuleiro;
	
	public Piece_Peca(Board_Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null;
	}

	protected Board_Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	

}
