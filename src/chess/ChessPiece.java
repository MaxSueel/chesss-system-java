package chess;

import boardgame_tabuleiro.Board_Tabuleiro;
import boardgame_tabuleiro.Piece_Peca;

public class ChessPiece extends Piece_Peca {
	
	private Color color;

	public ChessPiece(Board_Tabuleiro tabuleiro, Color color) {
		super(tabuleiro);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}


}









