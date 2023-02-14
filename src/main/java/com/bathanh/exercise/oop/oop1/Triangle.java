package com.bathanh.exercise.oop.oop1;

public class Triangle implements Shape {

    private Point point1;
    private Point point2;
    private Point point3;


    public Triangle() {
        point1 = new Point(0, 0);
        point2 = new Point(0, 0);
        point3 = new Point(0, 0);
    }

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

        return Math.abs(0.5 * ((x1 * (y2 - y3)) + (x2 * (y3 - y1)) + (x3 * (y1 - y2))));
    }

    public double getPerimeter() {
        double x1 = point1.getX();
        double y1 = point1.getY();
        double x2 = point2.getX();
        double y2 = point2.getY();
        double x3 = point3.getX();
        double y3 = point3.getY();
        double x12 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double x23 = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double x13 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
        return x12 + x23 + x13;
    }

    @Override
    public boolean contains(Point point) {
        double x1 = point1.getX();
        double y1 = point1.getY();
        double x2 = point2.getX();
        double y2 = point2.getY();
        double x3 = point3.getX();
        double y3 = point3.getY();
        double x = point.getX();
        double y = point.getY();
        var s = (x1 - x3) * (y - y3) - (y1 - y3) * (x - x3);
        var t = (x2 - x1) * (y - y1) - (y2 - y1) * (x - x1);

        if ((s < 0) != (t < 0) && s != 0 && t != 0)
            return false;
        var d = (x3 - x2) * (y - y2) - (y3 - y2) * (x - x2);

        return (d == 0) || (d < 0) == (s + t <= 0);
    }
}
