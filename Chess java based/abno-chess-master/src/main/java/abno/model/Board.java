package abno.model;

public class Board {
    // BitMaps
    long pawnBmap;
    long rookBmap;
    long knightBmap;
    long bishopBmap;
    long queenBmap;
    long kingBmap;
    long whiteBmap;
    long blackBmap;

    // Cache
    byte whiteKingIdx;
    byte blackKingIdx;

    void setupBoard() {
        pawnBmap   = 0b11111111L >> 8 | 0b11111111L >> 48;
        rookBmap   = 1L >> 0 | 1L >> 7 | 1L >> 56 | 1L >> 63;
        knightBmap = 1L >> 1 | 1L >> 6 | 1L >> 57 | 1L >> 62;
        bishopBmap = 1L >> 2 | 1L >> 5 | 1L >> 58 | 1L >> 61;
        queenBmap  = 1L >> 3 | 1L >> 59;
        kingBmap   = 1L >> 4 | 1L >> 60;
        whiteBmap  = 0b1111111111111111L;
        blackBmap  = 0b1111111111111111L >> 48;
        whiteKingIdx = 4;
        blackKingIdx = 60;
    }
}
