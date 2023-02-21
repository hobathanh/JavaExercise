package com.bathanh.exercise.oop.oop1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void getArea() {
        final Shape rectangle = new Rectangle(new Point(3, 4), new Point(5, 8));
        assertEquals(8, rectangle.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        final Shape rectangle = new Rectangle(new Point(3, 4), new Point(5, 8));
        assertEquals(12, rectangle.getPerimeter(), 0.0001);
    }

    @Test
    void contains() {
        final Shape rectangle = new Rectangle(new Point(3, 4), new Point(5, 8));

        assertFalse(rectangle.contains(new Point(7, 4)));
        assertFalse(rectangle.contains(new Point(2, 2)));
        assertFalse(rectangle.contains(new Point(6, 9)));
        assertTrue(rectangle.contains(new Point(3, 4)));
        assertTrue(rectangle.contains(new Point(5, 8)));
        assertTrue(rectangle.contains(new Point(4, 5)));
    }
}