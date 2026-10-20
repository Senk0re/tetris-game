package tetris.core;

import java.util.Random;

public class Game {
    private final Board board;
    private Piece current;
    private int score;
    private boolean gameOver;
    private final Random random = new Random();

    public Game(int width, int height) {
        board = new Board(width, height);
        spawnPiece();
    }

    // Creates a random piece in the middle of the board, near the top
    // If it does not fit, the board is full and the game if over
    private void spawnPiece() {
        PieceType[] all = PieceType.values();
        current = Piece.spawn(all[random.nextInt(all.length)], board.width() / 2, 1);
        if (!board.canPlace(current)) {
            gameOver = true;
        }
    }

    // Getters
    public Board board() {
        return board;
    }

    public Piece current() {
        return current;
    }

    public int score() {
        return score;
    }

    public boolean isGameOver() {
        return gameOver;
    }
}
