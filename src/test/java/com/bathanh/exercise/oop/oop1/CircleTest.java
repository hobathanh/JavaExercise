package com.bathanh.exercise.oop.oop1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    final Point point1 = new Point(7, 4);
    Shape circle = new Circle(point1, 3);

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
        final Point pointTest1 = new Point(8, 5);
        final Point pointTest2 = new Point(2, 2);

        assertFalse(circle.contains(pointTest2));
        assertTrue(circle.contains(pointTest1));
    }
}