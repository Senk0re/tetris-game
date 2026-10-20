package tetris;

import tetris.core.*;

public class Main {
    public static void main(String[] args) {
        Board brd = new Board(10, 20);
        System.out.println(brd.isRowFull(19));
        Piece p1 = Piece.spawn(PieceType.I, 1, 19);
        brd.lock(p1);
        Piece p2 = Piece.spawn(PieceType.I, 5, 19);
        brd.lock(p2);
        System.out.println(brd.isRowFull(19));
        Piece p3 = Piece.spawn(PieceType.O, 8, 19);
        brd.lock(p3);
        System.out.println(brd.isRowFull(19));
        System.out.println(brd.isRowFull(18));
        System.out.println(brd.isRowFull(0));
    }
}
