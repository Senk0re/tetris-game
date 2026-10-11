package tetris;

import tetris.core.*;

public class Main {
    public static void main(String[] args) {
        PieceType t = PieceType.T;

        for (Point p : t.cells()) {
            System.out.println(p + " -> " + p.rotateClockwise());
        }
    }
}
