package com.bathanh.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Exercise06Test {

    @Test
    void calculateSqrt_Ok() {
        final var Exercise06 = new Exercise06();

        assertThrows(IllegalArgumentException.class, () -> Exercise06.calculateSqrt(-5));
        assertEquals(0, Exercise06.calculateSqrt(0));
        assertEquals(8.16088230524, Exercise06.calculateSqrt(66.6), 0.0001);
        assertEquals(3, Exercise06.calculateSqrt(9), 0.0001);
    }
}