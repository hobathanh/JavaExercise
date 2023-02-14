package com.bathanh.exercise.oop.oop1;

public class Rectangle extends Square {

    private Point pointBottomLeft;
    private Point pointTopRight;

    public Rectangle() {
        super();
        pointBottomLeft = new Point(0, 0);
        pointTopRight = new Point(0, 0);
    }

    public Rectangle(Point pointBottomLeft, Point pointTopRight) {
        this();
        this.pointBottomLeft = pointBottomLeft;
        this.pointTopRight = pointTopRight;
    }

    @Override
    public double getArea() {
        return (pointTopRight.getX() - pointBottomLeft.getX()) * (pointTopRight.getY() - pointBottomLeft.getY());
    }

    @Override
    public double getPerimeter() {
        return 2 * ((pointTopRight.getX() - pointBottomLeft.getX()) + (pointTopRight.getY() - pointBottomLeft.getY()));
    }

    @Override
    public boolean contains(Point point) {
        final double x = point.getX();
        final double y = point.getY();
        return (x >= pointBottomLeft.getX() && x <= pointTopRight.getX()) && (y >= pointBottomLeft.getY() && y <= pointTopRight.getY());
    }
}
