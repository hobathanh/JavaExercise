package com.bathanh.exercise.oop.oop1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    final Point point1 = new Point(7, 4);
    final Shape circle = new Circle(point1, 3);

    @Test
    void getArea() {
        assertEquals(28.27, circle.getArea(), 0.01);
    }

    @Test
    void getPerimeter() {
        assertEquals(18.84, circle.getPerimeter(), 0.01);
    }

    @Test
    void contains() {
        assertFalse(circle.contains(new Point(2, 2)));
        assertTrue(circle.contains(new Point(8, 5)));
    }
}