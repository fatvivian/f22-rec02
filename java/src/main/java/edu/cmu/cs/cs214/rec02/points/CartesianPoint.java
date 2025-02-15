package edu.cmu.cs.cs214.rec02.points;

public class CartesianPoint implements Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public CartesianPoint (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
