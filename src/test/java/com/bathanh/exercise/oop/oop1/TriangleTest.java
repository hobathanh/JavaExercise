package com.bathanh.exercise.oop.oop1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    final Point point1 = new Point(3, 4);
    final Point point2 = new Point(7, 4);
    final Point point3 = new Point(5, 8);

    Shape triangle = new Triangle(point1, point2, point3);

    @Test
    void getArea() {
        assertEquals(8, triangle.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        assertEquals(12.9442, triangle.getPerimeter(), 0.0001);
    }

    @Test
    void contains() {
        assertFalse(triangle.contains(new Point(3, 3)));
        assertFalse(triangle.contains(new Point(6, 8)));
        assertFalse(triangle.contains(new Point(8, 4)));
        assertTrue(triangle.contains(point1));
        assertTrue(triangle.contains(point2));
        assertTrue(triangle.contains(point3));
        assertTrue(triangle.contains(new Point(5, 6)));
    }
}