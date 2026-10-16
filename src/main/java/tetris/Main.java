package tetris;

import tetris.core.*;

public class Main {
    public static void main(String[] args) {
        Board brd = new Board(10, 20);

        System.out.println(brd.canPlace(Piece.spawn(PieceType.T, 5, 1)));
        System.out.println(brd.canPlace(Piece.spawn(PieceType.T, 0, 1)));
        System.out.println(brd.canPlace(Piece.spawn(PieceType.T, 9, 1)));
        System.out.println(brd.canPlace(Piece.spawn(PieceType.T, 5, 19)));
        System.out.println(brd.canPlace(Piece.spawn(PieceType.T, 5, 20)));

    }
}
