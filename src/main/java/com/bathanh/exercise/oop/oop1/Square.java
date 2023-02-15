package com.bathanh.exercise.oop.oop1;

public class Square implements Shape {

    private double side;
    private Point pointBottomLeft;

    public Square() {
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
        return side * 4;
    }

    @Override
    public boolean contains(Point point) {
        final double x = point.getX();
        final double y = point.getY();
        double xBottomLeft = pointBottomLeft.getX();
        double yBottomLeft = pointBottomLeft.getY();
        double xTopRight = pointBottomLeft.getX() + side;
        double yTopRight = pointBottomLeft.getY() + side;

        if (x < xBottomLeft || x > xTopRight) {
            return false;
        }
        if (y < yBottomLeft || y > yTopRight) {
            return false;
        }
        return true;
    }
}
