package tetris.core;

public class Board {
    private final int width;
    private final int height;
    private final PieceType[][] grid;

    // Constructor
    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.grid = new PieceType[height][width];
    }

    // Getters
    public int width() {
        return this.width;
    }

    public int height() {
        return this.height;
    }

    // Returns the type of the piece occupying the cell, or null if the cell is
    // empty
    public PieceType cellAt(int x, int y) {
        return grid[y][x];
    }

    // Check if the point is inside of the board
    public boolean isInside(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }

    // Returns true if all 4 cells of the piece are inside the board and not
    // occupied
    public boolean canPlace(Piece piece) {
        for (Point cell : piece.cells()) {
            if (!isInside(cell.x(), cell.y())) {
                return false;
            }
            if (cellAt(cell.x(), cell.y()) != null) {
                return false;
            }
        }
        return true;
    }
}
