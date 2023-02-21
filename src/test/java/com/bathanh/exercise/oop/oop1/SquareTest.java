package com.bathanh.exercise.oop.oop1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getArea() {
        final Rectangle square = new Square(new Point(3, 4), 3);
        assertEquals(9, square.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        final Rectangle square = new Square(new Point(3, 4), 3);
        assertEquals(12, square.getPerimeter(), 0.0001);
    }

    @Test
    void contains() {
        final Rectangle square = new Square(new Point(3, 4), 3);

        assertFalse(square.contains(new Point(2, 2)));
        assertFalse(square.contains(new Point(9, 10)));
        assertFalse(square.contains(new Point(10, 5)));
        assertTrue(square.contains(new Point(3, 4)));
        assertTrue(square.contains(new Point(3, 1)));
        assertTrue(square.contains(new Point(6, 4)));
        assertTrue(square.contains(new Point(6, 1)));
        assertTrue(square.contains(new Point(5, 3)));
    }
}