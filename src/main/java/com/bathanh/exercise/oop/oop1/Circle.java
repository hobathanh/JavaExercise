package com.bathanh.exercise.oop.oop1;

public class Circle implements Shape {

    private double radius;
    private Point center;


    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public boolean contains(Point point) {
        double x = point.getX();
        double y = point.getY();
        double dx = Math.abs(x - center.getX());
        double dy = Math.abs(y - center.getY());
        return (dx * dx + dy * dy <= radius * radius);
    }
}
