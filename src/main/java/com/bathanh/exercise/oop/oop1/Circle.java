package com.bathanh.exercise.oop.oop1;

public class Circle implements Shape {

    private final double radius;
    private final Point center;

    public Circle(final Point center, final double radius) {
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
    public boolean contains(final Point point) {
        return point.distanceTo(center) * point.distanceTo(center) <= radius * radius;
    }
}
