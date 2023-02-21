package com.bathanh.exercise.oop.oop1;

public class Rectangle implements Shape {

    private final Point bottomLeft;
    private final Point topRight;

    public Rectangle(final Point bottomLeft, final Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    @Override
    public double getArea() {
        final double dx = topRight.getX() - bottomLeft.getX();
        final double dy = topRight.getY() - bottomLeft.getY();
        return dx * dy;
    }

    @Override
    public double getPerimeter() {
        final double dx = topRight.getX() - bottomLeft.getX();
        final double dy = topRight.getY() - bottomLeft.getY();
        return 2 * (dx + dy);
    }

    @Override
    public boolean contains(final Point point) {
        final double x = point.getX();
        final double y = point.getY();

        if (!(x >= bottomLeft.getX() && x <= topRight.getX())) {
            return false;
        }
        return y >= bottomLeft.getY() && y <= topRight.getY();
    }
}
