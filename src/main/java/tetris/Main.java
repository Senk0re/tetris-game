package tetris;

import tetris.core.*;

public class Main {
    public static void main(String[] args) {
        PieceType t = PieceType.T;
        PieceType i = PieceType.I;
        Piece pt = Piece.spawn(t, 5, 1);
        Piece ptRotated = pt.rotatedClockwise();
        Piece pi = Piece.spawn(i, 5, 1);
        Piece piRotated = pi.rotatedClockwise();
        System.out.println(ptRotated.cells());
        System.out.println(pt.cells());
        System.out.println(piRotated.cells());
        System.out.println(pi.cells());
    }
}
