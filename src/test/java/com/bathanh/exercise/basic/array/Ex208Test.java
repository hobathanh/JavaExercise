package com.bathanh.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex208Test {

    @Test
    void sumOfSquares_Ok() {
        final var ex208 = new Ex208();

        assertEquals(30, ex208.sumOfSquares(new int[]{1, 3, 4, 2}));
    }
}