package com.bathanh.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise03Test {

    @Test
    void analysisOutPrimeNumbers_Ok() {
        final var Exercise03 = new Exercise03();

        assertEquals("2 * 2 * 2", Exercise03.analysisOutPrimeNumbers(8));
        assertEquals("0", Exercise03.analysisOutPrimeNumbers(1));
        assertEquals("0", Exercise03.analysisOutPrimeNumbers(0));
        assertEquals("2", Exercise03.analysisOutPrimeNumbers(2));
        assertEquals("2 * 2 * 2 * 3 * 5 * 5", Exercise03.analysisOutPrimeNumbers(600));
        assertEquals("- 7", Exercise03.analysisOutPrimeNumbers(-7));
        assertEquals("- 2 * 2 * 2", Exercise03.analysisOutPrimeNumbers(-8));
        assertEquals(false, Exercise03.isPrimeNumber(1));
    }
}