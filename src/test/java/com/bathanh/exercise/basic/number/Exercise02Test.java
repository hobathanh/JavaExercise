package com.bathanh.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise02Test {

    @Test
    void calculateSumOfDigits_Ok() {
        final var Exercise02 = new Exercise02();

        assertEquals(15, Exercise02.calculateSumOfDigits(2535));
        assertEquals(10, Exercise02.calculateSumOfDigits(1234));
        assertEquals(7, Exercise02.calculateSumOfDigits(1204));

    }
}