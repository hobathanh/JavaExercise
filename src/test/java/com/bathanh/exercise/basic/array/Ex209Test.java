package com.bathanh.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex209Test {

    @Test
    void sumPrimesArray() {
        final var ex209 = new Ex209();

        assertEquals(3, ex209.countPrimesArray(new int[]{1, 2, 3, 5, 6, 8}));
    }

    @Test
    void checkPrime() {
        final var ex209 = new Ex209();

        assertEquals(true, ex209.checkPrime(2));
        assertEquals(false, ex209.checkPrime(1));
    }
}