package tetris;

import tetris.core.*;

public class Main {
    public static void main(String[] args) {
        Board brd = new Board(10, 20);

        Piece p1 = Piece.spawn(PieceType.I, 1, 19);
        brd.lock(p1);
        Piece p2 = Piece.spawn(PieceType.I, 5, 19);
        brd.lock(p2);
        Piece p3 = Piece.spawn(PieceType.O, 8, 19);
        brd.lock(p3);
        Piece p4 = Piece.spawn(PieceType.I, 1, 18);
        brd.lock(p4);
        Piece p5 = Piece.spawn(PieceType.I, 5, 18);
        brd.lock(p5);

        Piece p6 = Piece.spawn(PieceType.O, 0, 17);
        brd.lock(p6);

        System.out.println(brd.clearLines());
        System.out.println(brd.isRowFull(19));
        System.out.println(brd.cellAt(0, 19) + " " + brd.cellAt(1, 19));
        System.out.println(brd.cellAt(0, 18) + " " + brd.cellAt(1, 18));
        System.out.println(brd.cellAt(5, 19));
        System.out.println(brd.cellAt(0, 17));
        System.out.println(brd.clearLines());

    }
}
