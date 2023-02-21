package com.bathanh.exercise.oop.oop1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getArea() {
        final Shape triangle = new Triangle(new Point(3, 4), new Point(7, 4), new Point(5, 8));
        assertEquals(8, triangle.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        final Shape triangle = new Triangle(new Point(3, 4), new Point(7, 4), new Point(5, 8));
        assertEquals(12.9442, triangle.getPerimeter(), 0.0001);
    }

    @Test
    void contains() {
        final Shape triangle = new Triangle(new Point(3, 4), new Point(7, 4), new Point(5, 8));

        assertFalse(triangle.contains(new Point(2, 6)));
        assertFalse(triangle.contains(new Point(5, 3)));
        assertFalse(triangle.contains(new Point(8, 6)));
        assertTrue(triangle.contains(new Point(3, 4)));
        assertTrue(triangle.contains(new Point(7, 4)));
        assertTrue(triangle.contains(new Point(5, 8)));
        assertTrue(triangle.contains(new Point(5, 6)));
    }
}