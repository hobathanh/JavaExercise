package com.bathanh.exercise.oop.oop1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getArea() {
        final Rectangle square = new Square(new Point(3, 4), new Point(8, 9));
        assertEquals(25.0, square.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        final Rectangle square = new Square(new Point(3, 4), new Point(8, 9));
        assertEquals(20.0, square.getPerimeter(), 0.0001);
    }

    @Test
    void contains() {
        final Rectangle square = new Square(new Point(3, 4), new Point(8, 9));

        assertFalse(square.contains(new Point(2, 2)));
        assertFalse(square.contains(new Point(9, 10)));
        assertFalse(square.contains(new Point(10, 5)));
        assertTrue(square.contains(new Point(3, 4)));
        assertTrue(square.contains(new Point(8, 9)));
        assertTrue(square.contains(new Point(5, 7)));
    }
}