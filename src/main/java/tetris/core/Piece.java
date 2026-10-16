package tetris.core;

import java.util.List;

public record Piece(PieceType type, int x, int y, List<Point> offsets) {
    public static Piece spawn(PieceType type, int x, int y) {
        return new Piece(type, x, y, type.cells());
    }
}
