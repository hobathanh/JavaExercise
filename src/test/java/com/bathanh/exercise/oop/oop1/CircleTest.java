package com.bathanh.exercise.oop.oop1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class CircleTest {

    Point point1 = new Point(3, 4);
    Point point2 = new Point(7, 4);
    Shape circle = new Circle(point2, 3);

    @Test
    void getArea() {
        assertEquals(28.26, circle.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        assertEquals(18.84, circle.getPerimeter(), 0.0001);
    }

    @Test
    void contains() {
        assertFalse(circle.contains(point1));
    }
}