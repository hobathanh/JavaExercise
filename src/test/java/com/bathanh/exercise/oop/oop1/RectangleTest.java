package com.bathanh.exercise.oop.oop1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void getArea() {
        final Shape rectangle = new Rectangle(new Point(-3, -3), 4, 3);
        assertEquals(12, rectangle.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        final Shape rectangle = new Rectangle(new Point(-3, -3), 4, 3);
        assertEquals(14, rectangle.getPerimeter(), 0.0001);
    }

    @Test
    void contains() {
        final Shape rectangle = new Rectangle(new Point(-3, -3), 4, 3);

        assertFalse(rectangle.contains(new Point(-2, -2)));
        assertFalse(rectangle.contains(new Point(-2, -7)));
        assertFalse(rectangle.contains(new Point(2, -5)));
        assertFalse(rectangle.contains(new Point(-4, -5)));
        assertTrue(rectangle.contains(new Point(-2, -5)));
        assertTrue(rectangle.contains(new Point(-3, -3)));
        assertTrue(rectangle.contains(new Point(-3, -6)));
        assertTrue(rectangle.contains(new Point(1, -3)));
        assertTrue(rectangle.contains(new Point(1, -6)));
    }
}