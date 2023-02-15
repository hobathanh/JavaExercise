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
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean contains(Point point) {
        final double x = point.getX();
        final double y = point.getY();
        final double dx = Math.abs(x - center.getX());
        final double dy = Math.abs(y - center.getY());
        return (dx * dx + dy * dy <= radius * radius);
    }
}
