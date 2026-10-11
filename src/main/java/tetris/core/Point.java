package tetris.core;

// Each figure is build from 4 point each in the form (x,y)
// We can rotate a figure clockwise changing each point x value to -y and y value to x
// (0,1) => (-1,0) the point moved from the bottom to the left
public record Point(int x, int y) {
    public Point rotateClockwise() {
        return new Point(-y, x);
    }
}
