package tetris;

import tetris.core.*;

public class Main {
    public static void main(String[] args) {
        PieceType t = PieceType.T;
        Piece p = Piece.spawn(t, 5, 1);
        Piece pMoved = p.movedBy(0, 1);
        System.out.println(pMoved.cells());
        System.out.println(p.cells());

    }
}
