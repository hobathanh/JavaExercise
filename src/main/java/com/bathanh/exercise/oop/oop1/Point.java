package com.bathanh.exercise.oop.oop1;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceTo(final Point point) {
        return Math.sqrt((point.getX() - this.getX()) * (point.getX() - this.getX())
                + (point.getY() - this.getY()) * (point.getY() - this.getY()));
    }
}
