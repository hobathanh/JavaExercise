package com.bathanh.exercise.oop.oop1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Point point1 = new Point(7, 4);
    Shape circle = new Circle(point1, 3);

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
        Point pointTest1 = new Point(8, 5);
        Point pointTest2 = new Point(2, 2);

        assertFalse(circle.contains(pointTest2));
        assertTrue(circle.contains(pointTest1));
    }
}