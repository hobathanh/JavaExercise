package com.bathanh.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Exercise09Test {

    @Test
    void calculateSqrt_Ok() {
        final var exercise09 = new Exercise09();

        assertThrows(IllegalArgumentException.class, () -> exercise09.calculateSqrt(-5));
        assertEquals(1, exercise09.calculateSqrt(1));
        assertEquals(0, exercise09.calculateSqrt(0));
        assertEquals(2.98328, exercise09.calculateSqrt(8.9), 0.00001);
        assertEquals(3, exercise09.calculateSqrt(9), 0.00001);
        assertEquals(8.29457, exercise09.calculateSqrt(68.8), 0.00001);

    }
}