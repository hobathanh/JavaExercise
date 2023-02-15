package com.bathanh.exercise.oop.oop1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    final Point point1 = new Point(3, 4);
    final Point point2 = new Point(8, 9);
    Rectangle square = new Square(point1, point2);

    @Test
    void getArea() {
        assertEquals(25.0, square.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        assertEquals(20.0, square.getPerimeter(), 0.0001);
    }

    @Test
    void contains() {
        assertFalse(square.contains(new Point(2, 2)));
        assertFalse(square.contains(new Point(9, 10)));
        assertFalse(square.contains(new Point(10, 5)));
        assertTrue(square.contains(point1));
        assertTrue(square.contains(point2));
        assertTrue(square.contains(new Point(5, 7)));
    }
}