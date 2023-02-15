package com.bathanh.exercise.oop.oop1;

public class Rectangle implements Shape {

    private final Point pointBottomLeft;
    private final Point pointTopRight;

//    public Rectangle() {
//        pointTopRight = new Point(0, 0);
//        pointBottomLeft = new Point(0, 0);
//    }

    public Rectangle(Point bottomLeft, Point topRight) {
        this.pointBottomLeft = bottomLeft;
        this.pointTopRight = topRight;
    }

    @Override
    public double getArea() {
        return (pointTopRight.getX() - pointBottomLeft.getX()) * (pointTopRight.getY() - pointBottomLeft.getY());
    }

    @Override
    public double getPerimeter() {
        final double xTopRight = pointTopRight.getX();
        final double yTopRight = pointTopRight.getY();
        final double xBottomLeft = pointBottomLeft.getX();
        final double yBottomLeft = pointBottomLeft.getY();
        return 2 * ((xTopRight - xBottomLeft) + (yTopRight - yBottomLeft));
    }

    @Override
    public boolean contains(Point point) {
        final double x = point.getX();
        final double y = point.getY();

        if (!(x >= pointBottomLeft.getX() && x <= pointTopRight.getX())) {
            return false;
        }
        return y >= pointBottomLeft.getY() && y <= pointTopRight.getY();
    }
}
