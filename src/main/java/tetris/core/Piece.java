package tetris.core;

import java.util.ArrayList;
import java.util.List;

// A piece on the board: its type, where its pivot is, and how it is rotated.
// A piece never changes: moving or rotating it creates a new Piece.
// x and y are board coordinates
// offsets are the 4 cells relative to the pivot, not board coordinates.
public record Piece(PieceType type, int x, int y, List<Point> offsets) {

    // Creates a piece in its starting position without rotation
    public static Piece spawn(PieceType type, int x, int y) {
        return new Piece(type, x, y, type.cells());
    }

    // Returns the 4 cells of the piece in board coordinates
    public List<Point> cells() {
        List<Point> points = new ArrayList<>();
        for (Point offset : offsets) {
            points.add(new Point(offset.x() + x, offset.y() + y));
        }
        return points;
    }

    // Returns a new piece moved by dx columns and dy rows
    public Piece movedBy(int dx, int dy) {
        return new Piece(type, x + dx, y + dy, offsets);
    }

    // Returns a new piece rotated by 90° clockwise
    // The O piece looks the same after rotation, so it returned unchanged
    public Piece rotatedClockwise() {
        if (type == PieceType.O) {
            return this;
        }

        List<Point> points = new ArrayList<>();
        for (Point offset : offsets) {
            points.add(offset.rotateClockwise());
        }
        return new Piece(type, x, y, points);
    }
}
