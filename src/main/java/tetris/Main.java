package tetris;

import tetris.core.*;

public class Main {
    public static void main(String[] args) {
        Board brd = new Board(10, 20);
        Piece p1 = Piece.spawn(PieceType.T, 5, 19);
        Piece p2 = Piece.spawn(PieceType.T, 5, 18);
        Piece p3 = Piece.spawn(PieceType.T, 5, 17);
        System.out.println(brd.canPlace(p1));
        brd.lock(p1);
        System.out.println(
                brd.cellAt(5, 19) + " " + brd.cellAt(5, 18) + " " + brd.cellAt(4, 19) + " " + brd.cellAt(6, 19));
        System.out.println(brd.cellAt(5, 17) + " " + brd.cellAt(0, 0));
        System.out.println(brd.canPlace(p1));
        System.out.println(brd.canPlace(p2));
        System.out.println(brd.canPlace(p3));

    }
}
