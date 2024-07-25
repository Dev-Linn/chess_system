package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMath {

    private Board board;


    public ChessMath() {
        board = new Board(8,8);
        initialSetup();

    }

    public ChessPiece[][] getPieces() { // RETORNA A MATRIZ DE PEÇAS DA PARTIDA DE XADREZ
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        } return mat;
    }

    private void initialSetup() {
       board.placePiece(new Rook(board, Color.WHITE), new Position(0,0));
       board.placePiece(new King(board, Color.BLACK), new Position(0,4));
        board.placePiece(new King(board, Color.WHITE), new Position(7,4));

    }

}
