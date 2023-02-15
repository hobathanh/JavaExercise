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
        final Point pointTest1 = new Point(5, 7);
        final Point pointTest2 = new Point(2, 2);
        final Point pointTest3 = new Point(9, 10);
        final Point pointTest4 = new Point(10, 5);


        assertFalse(square.contains(pointTest2));
        assertFalse(square.contains(pointTest3));
        assertFalse(square.contains(pointTest4));
        assertTrue(square.contains(point1));
        assertTrue(square.contains(point2));
        assertTrue(square.contains(pointTest1));
    }
}