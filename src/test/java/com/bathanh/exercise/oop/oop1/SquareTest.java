package com.bathanh.exercise.oop.oop1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    final Point point1 = new Point(3, 4);
    Shape square = new Square(point1, 5);

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
        final Point pointTest1 = new Point(2, 2);
        final Point pointTest2 = new Point(6, 7);
        final Point pointTest3 = new Point(8, 9);

        assertFalse(square.contains(pointTest1));
        assertTrue(square.contains(point1));
        assertTrue(square.contains(pointTest2));
        assertTrue(square.contains(pointTest3));
    }
}