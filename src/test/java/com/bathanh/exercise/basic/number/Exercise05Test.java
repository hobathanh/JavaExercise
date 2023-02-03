package com.bathanh.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise05Test {

    @Test
    void sumOfNumbers_OK() {
        final var Exercise05 = new Exercise05();

        assertEquals(20, Exercise05.sumOfNumbers(3));
        assertEquals(2, Exercise05.sumOfNumbers(1));
        assertEquals(0, Exercise05.sumOfNumbers(0));
        assertThrows(IllegalArgumentException.class, () -> Exercise05.sumOfNumbers(-5));
    }
}