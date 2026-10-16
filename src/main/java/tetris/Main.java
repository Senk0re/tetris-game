package tetris;

import tetris.core.*;

public class Main {
    public static void main(String[] args) {
        PieceType t = PieceType.T;
        Piece p = Piece.spawn(t, 5, 1);
        System.out.println(p);
    }
}
