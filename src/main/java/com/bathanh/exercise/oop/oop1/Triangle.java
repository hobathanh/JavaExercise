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

    @Override
    public boolean contains(Point point) {
        final double x = point.getX();
        final double y = point.getY();
        double x1 = point1.getX();
        double y1 = point1.getY();
        double x2 = point2.getX();
        double y2 = point2.getY();
        double x3 = point3.getX();
        double y3 = point3.getY();

        var s = (x1 - x3) * (y - y3) - (y1 - y3) * (x - x3);
        var t = (x2 - x1) * (y - y1) - (y2 - y1) * (x - x1);

        if ((s < 0) != (t < 0) && s != 0 && t != 0)
            return false;
        var d = (x3 - x2) * (y - y2) - (y3 - y2) * (x - x2);

        return (d == 0) || (d < 0) == (s + t <= 0);
    }
}
