package tetris.core;

import java.util.List;

// An enum is a class that represents a group of constants
// In our case these constants are our figures (T,S,Z,J,L,I,O)
// Each figure consists of 4 cells, stored as offsets from the pivot (0,0)
public enum PieceType {
    T(new Point(0, 0), new Point(0, -1), new Point(-1, 0), new Point(1, 0)),
    S(new Point(0, 0), new Point(0, -1), new Point(1, -1), new Point(-1, 0)),
    Z(new Point(0, 0), new Point(0, -1), new Point(-1, -1), new Point(1, 0)),
    J(new Point(0, 0), new Point(1, 0), new Point(-1, 0), new Point(-1, -1)),
    L(new Point(0, 0), new Point(1, 0), new Point(-1, 0), new Point(1, -1)),
    I(new Point(0, 0), new Point(1, 0), new Point(2, 0), new Point(-1, 0)),
    O(new Point(0, 0), new Point(0, -1), new Point(1, 0), new Point(1, -1));

    private final List<Point> cells;

    PieceType(Point... cells) {
        this.cells = List.of(cells);
    }

    public List<Point> cells() {
        return cells;
    }
}
