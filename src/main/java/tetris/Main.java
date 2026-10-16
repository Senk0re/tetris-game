package tetris;

import tetris.core.*;

public class Main {
    public static void main(String[] args) {
        Board brd = new Board(10, 20);

        System.out.println(brd.width());
        System.out.println(brd.height());

        System.out.println(brd.cellAt(0, 0));
        System.out.println(brd.cellAt(9, 19));

        // System.out.println(brd.cellAt(10, 0));
        // ArrayIndexOutOfBoundException
    }
}
