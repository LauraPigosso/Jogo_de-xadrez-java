package Chess;

import Chess.pieces.King;
import Chess.pieces.Rook;
import boardgame.Board;
import boardgame.Position;

public class ChessMatch {
    private Board board;
    public ChessMatch(){
        board = new Board(8,8);
        initialSetup();
    }
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i<board.getRows(); i++){
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
    private void placenewPiece(char column, int row, ChessPiece piece){
        board.PlacePiece(piece,new ChessPosition(column, row).toPosition());
    }
    private void initialSetup(){
        placenewPiece('b', 6,  new Rook(board, Color.WHITE));
        placenewPiece('b', 6,new King(board, Color.BLACK));
        placenewPiece('b', 6,new King(board, Color.WHITE));
    }
}
