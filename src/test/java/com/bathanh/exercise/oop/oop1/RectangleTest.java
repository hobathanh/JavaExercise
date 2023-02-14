package com.bathanh.exercise.oop.oop1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {


    final Point point1 = new Point(3, 4);
    final Point point2 = new Point(5, 8);
    Square rectangle = new Rectangle(point1, point2);

    @Test
    void getArea() {
        assertEquals(8, rectangle.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        assertEquals(12, rectangle.getPerimeter(), 0.0001);
    }

    @Test
    void contains() {
        final Point pointTest1 = new Point(7, 4);
        final Point pointTest2 = new Point(4, 5);

        assertFalse(rectangle.contains(pointTest1));
        assertTrue(rectangle.contains(point1));
        assertTrue(rectangle.contains(point2));
        assertTrue(rectangle.contains(pointTest2));
    }
}