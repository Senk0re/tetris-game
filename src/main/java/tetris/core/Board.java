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
}
