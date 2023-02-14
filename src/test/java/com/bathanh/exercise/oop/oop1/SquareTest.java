package com.bathanh.exercise.oop.oop1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    Point point1 = new Point(3, 4);
    Point point2 = new Point(7, 4);
    Shape square = new Square(point1, 5);

    @Test
    void getArea() {
        assertEquals(25.0, square.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        assertEquals(20.0, square.getPerimeter(), 0.0001);
    }

    @Test
    void contains() {
        assertEquals(true, square.contains(point2));
    }
}