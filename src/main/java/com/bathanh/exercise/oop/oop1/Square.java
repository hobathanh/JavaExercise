package com.bathanh.exercise.oop.oop1;

public class Square implements Shape {

    private double side;

    private double length;
    private double width;

    public Square(double side) {
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
}
