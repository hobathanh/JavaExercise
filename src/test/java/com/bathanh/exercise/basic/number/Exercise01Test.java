package com.bathanh.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise01Test {

    @Test
    void USCLN_OK() {
        final var Exercise01 = new Exercise01();

        assertEquals(7, Exercise01.USCLN(91, 287));
        assertEquals(8, Exercise01.USCLN(16, 8));
    }

    @Test
    void BSCNN_OK() {
        final var Exercise01 = new Exercise01();

        assertEquals(10, Exercise01.BSCNN(1, 10));
        assertEquals(12, Exercise01.BSCNN(4, 6));
    }
}