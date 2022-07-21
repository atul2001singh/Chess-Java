package abno.model;

public class BoardHandler {

    static Board board = new Board();

    public static void movePiece(byte pieceIdx, byte targetIdx) {

        // Find piece bitmap, return if none
        long colorBmap;
        if((board.whiteBmap & 1L << pieceIdx) == 1) {
            colorBmap = board.whiteBmap;
        }
        else if ((board.blackBmap & 1L << pieceIdx) == 1) {
            colorBmap = board.blackBmap;
        }
        else {
            return;
        }

        // Find color bitmap, return if none
        long pieceBmap;
        if((board.pawnBmap & 1L << pieceIdx) == 1)
            pieceBmap = board.pawnBmap;
        else if ((board.rookBmap & 1L << pieceIdx) == 1)
            pieceBmap = board.rookBmap;
        else if ((board.knightBmap & 1L << pieceIdx) == 1)
            pieceBmap = board.knightBmap;
        else if ((board.bishopBmap & 1L << pieceIdx) == 1)
            pieceBmap = board.bishopBmap;
        else if ((board.queenBmap & 1L << pieceIdx) == 1)
            pieceBmap = board.queenBmap;
        else if ((board.kingBmap & 1L << pieceIdx) == 1)
            pieceBmap = board.kingBmap;
        else
            return;

        // Modify bitmaps
        pieceBmap &= Long.MAX_VALUE ^ (1L << pieceIdx);
        pieceBmap |= 1L << targetIdx;
        colorBmap &= Long.MAX_VALUE ^ (1L << pieceIdx);
        colorBmap |= 1L << targetIdx;

    }
}
