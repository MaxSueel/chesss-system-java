package chess;

import boardgame_tabuleiro.Board_Tabuleiro;

public class ChessMatch {

	private Board_Tabuleiro tabuleiro;

	public ChessMatch() {
		tabuleiro = new Board_Tabuleiro(8, 8);
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[tabuleiro.getRows()][tabuleiro.getColumns()];
		for (int i = 0; i < tabuleiro.getRows(); i++) {
			for (int j = 0; j < tabuleiro.getColumns(); j++) {
				mat[i][j] = (ChessPiece) tabuleiro.peca(i, j);

			}
		}
		return mat;
	}

}














/*public ChessPiece[][] getPieces() {
ChessPiece[][] mat = new ChessPiece[tabuleiro.getRows()][tabuleiro.getColumns()];
for (int i = 0; i < tabuleiro.getRows(); i++) {
	for (int j = 0; j < tabuleiro.getColumns(); j++) {
		Piece_Peca peca = tabuleiro.peca(i, j);
		if (peca != null) {
			mat[i][j] = (ChessPiece)peca; // Cast implícito, pois Peca é subclasse de ChessPiece
		}
	}
}
return mat;*/