package com.bathanh.exercise.oop.oop1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TriangleTest {

    Point point1 = new Point(3, 4);
    Point point2 = new Point(7, 4);
    Point point3 = new Point(5, 8);
    Point point4 = new Point(4, 5);
    Shape triangle = new Triangle(point1, point2, point3);

    @Test
    void getArea() {
        assertEquals(8, triangle.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        assertEquals(12.9442, triangle.getPerimeter(), 0.0001);
    }

    @Test
    void contains() {
        assertTrue(triangle.contains(point4));
    }
}