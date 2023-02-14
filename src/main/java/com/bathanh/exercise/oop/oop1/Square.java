package com.bathanh.exercise.oop.oop1;

public class Square implements Shape {

    private double side;
    private Point pointBottomLeft;

    public Square() {
        pointBottomLeft = new Point(0, 0);
        side = 1;
    }

    public Square(Point pointBottomLeft, double side) {
        this.pointBottomLeft = pointBottomLeft;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return (side + side) * 2;
    }

    @Override
    public boolean contains(Point point) {
        double x = point.getX();
        double y = point.getY();
        double xBottomLeft = pointBottomLeft.getX();
        double yBottomLeft = pointBottomLeft.getY();
        double xTopRight = pointBottomLeft.getX() + side;
        double yTopRight = pointBottomLeft.getY() + side;
        if ((x >= xBottomLeft && x <= xTopRight) && (y >= yBottomLeft && y <= yTopRight)) {
            return true;
        }
        return false;
    }
}
