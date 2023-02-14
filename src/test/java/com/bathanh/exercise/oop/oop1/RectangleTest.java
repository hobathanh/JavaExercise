package com.bathanh.exercise.oop.oop1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class RectangleTest {


    Point point1 = new Point(3, 4);
    Point point2 = new Point(7, 4);
    Point point3 = new Point(5, 8);
    Square rectangle = new Rectangle(point1, point3);

    @Test
    void getArea() {
        assertEquals(8, rectangle.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        assertEquals(12, rectangle.getPerimeter(), 0.0001);
    }

    @Test
    void contains() {
        assertFalse(rectangle.contains(point2));
    }
}