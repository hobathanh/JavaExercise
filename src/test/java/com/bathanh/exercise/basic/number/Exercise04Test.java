package com.bathanh.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise04Test {

    @Test
    void calculateFibonacci_OK() {
        final var Exercise04 = new Exercise04();

        assertEquals(0, Exercise04.calculateFibonacci(0));
        assertEquals(1, Exercise04.calculateFibonacci(1));
        assertEquals(7, Exercise04.calculateFibonacci(4));
        assertEquals(4, Exercise04.calculateFibonacci(3));
        assertThrows(NegativeArraySizeException.class, () -> Exercise04.calculateFibonacci(-5));

    }
}