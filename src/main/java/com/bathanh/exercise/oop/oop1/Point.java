package com.bathanh.exercise.oop.oop1;

public class Point {
    private final int x;
    private final int y;

    public Point(final int x, final int y) {
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
        final double dx = point.getX() - this.getX();
        final double dy = point.getY() - this.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
