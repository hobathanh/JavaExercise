package com.bathanh.exercise.oop.oop1;

public class Rectangle implements Shape {

    private final Point topLeft;
    private final double width;
    private final double height;

    public Rectangle(final Point topLeft, final double width, final double height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public boolean contains(final Point point) {
        final double x = point.getX();
        final double y = point.getY();

        if (!(x <= (topLeft.getX() + width) && x >= topLeft.getX())) {
            return false;
        }
        return y >= (topLeft.getY() - height) && y <= topLeft.getY();
    }
}
