package com.bathanh.exercise.oop.oop1;

public class Triangle implements Shape {

    private final Point point1;
    private final Point point2;
    private final Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public double getArea() {
        double x1 = point1.getX();
        double y1 = point1.getY();
        double x2 = point2.getX();
        double y2 = point2.getY();
        double x3 = point3.getX();
        double y3 = point3.getY();

        return Math.abs(0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)));
    }

    public double getPerimeter() {
        return point1.distanceTo(point2) + point2.distanceTo(point3) + point3.distanceTo(point1);
    }

    public double sideOfTheLine(final Point point1, final Point point2, final Point point) {
        final double x = point.getX();
        final double y = point.getY();
        final double x1 = point1.getX();
        final double y1 = point1.getY();
        final double x2 = point2.getX();
        final double y2 = point2.getY();
        return (x - x1) * (y2 - y1) - (y - y1) * (x2 - x1);
    }

    @Override
    public boolean contains(final Point point) {
        if (sideOfTheLine(point1, point2, point) * sideOfTheLine(point1, point2, point3) < 0) {
            return false;
        }

        if (sideOfTheLine(point1, point3, point) * sideOfTheLine(point1, point3, point2) < 0) {
            return false;
        }

        return sideOfTheLine(point2, point3, point) * sideOfTheLine(point2, point3, point1) >= 0;
    }
}
