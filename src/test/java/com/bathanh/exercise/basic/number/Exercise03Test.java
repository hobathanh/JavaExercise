package com.bathanh.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise03Test {

    @Test
    void analysisOutPrimeNumbers_Ok() {
        final var Exercise03 = new Exercise03();

        assertEquals("2 * 2 * 2",Exercise03.analysisOutPrimeNumbers(8));
        assertEquals("2 * 2",Exercise03.analysisOutPrimeNumbers(4));
        assertEquals("2 * 2 * 2 * 3 * 5 * 5",Exercise03.analysisOutPrimeNumbers(600));
        assertEquals("Input khong hop le",Exercise03.analysisOutPrimeNumbers(1));

    }
}