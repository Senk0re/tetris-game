package tetris;

import tetris.core.Point;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 0);
        Point p2 = new Point(0, 1);
        Point p3 = new Point(-1, 0);
        Point p4 = new Point(0, -1);

        System.out.println(p1.rotateClockwise().rotateClockwise().rotateClockwise().rotateClockwise());
        System.out.println(p1.rotateClockwise());
        System.out.println(p1.rotateClockwise());
        System.out.println(p1.rotateClockwise());

    }
}
