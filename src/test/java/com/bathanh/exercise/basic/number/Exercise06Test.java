package com.bathanh.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise06Test {

    @Test
    void calculateSqrt_Ok() {
        final var Exercise06 = new Exercise06();

        assertThrows(IllegalArgumentException.class, () -> Exercise06.calculateSqrt(-5));
        assertEquals(0, Exercise06.calculateSqrt(0));
        assertEquals(3.0001, Exercise06.calculateSqrt(9));
        assertEquals(8.1609, Exercise06.calculateSqrt(66.6));
    }
}