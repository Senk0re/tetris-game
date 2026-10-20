package tetris;

import tetris.core.*;

public class Main {
    public static void main(String[] args) {
        Game g = new Game(10, 20);
        System.out.println(g.current());
        System.out.println(g.score());
        System.out.println(g.isGameOver());
        System.out.println(g.board().width());
    }
}
