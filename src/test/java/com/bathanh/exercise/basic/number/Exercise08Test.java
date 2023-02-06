package com.bathanh.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Exercise08Test {

    @Test
    void reverseBits_OK() {
        final var exercise08 = new Exercise08();

        assertEquals(29, exercise08.reverseBits(23));
        assertEquals(1, exercise08.reverseBits(1));
    }
}