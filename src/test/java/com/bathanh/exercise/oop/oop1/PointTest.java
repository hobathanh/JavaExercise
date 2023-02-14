package com.bathanh.exercise.oop.oop1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    @Test
    void getX() {
        Point p = new Point(3, 4);
        assertEquals(3, p.getX());
    }

    @Test
    void getY() {
        Point p = new Point(3, 4);
        assertEquals(4, p.getY());
    }
}