package com.bathanh.exercise.oop.oop1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getArea() {
        final Shape circle = new Circle(new Point(7, 4), 3);
        assertEquals(28.27, circle.getArea(), 0.01);
    }

    @Test
    void getPerimeter() {
        final Shape circle = new Circle(new Point(7, 4), 3);
        assertEquals(18.84, circle.getPerimeter(), 0.01);
    }

    @Test
    void contains() {
        final Shape circle = new Circle(new Point(7, 4), 3);
        
        assertFalse(circle.contains(new Point(2, 2)));
        assertTrue(circle.contains(new Point(8, 5)));
    }
}