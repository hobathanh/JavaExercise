package com.bathanh.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise203Test {

    @Test
    void sortSumOfDigitAsc_Ok() {
        final var exercise203 = new Exercise203();

        assertArrayEquals(new int[]{21, 3, 23, 43, 324}, exercise203.sortSumOfDigitAsc(new int[]{43, 23, 21, 324, 3}));
    }

    @Test
    void sumOfDigits_Ok() {
        final var exercise203 = new Exercise203();

        assertEquals(5, exercise203.sumOfDigits(23));
        assertEquals(1, exercise203.sumOfDigits(10));
        assertEquals(0, exercise203.sumOfDigits(0));
    }
}