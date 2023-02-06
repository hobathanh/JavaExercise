package com.bathanh.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise202Test {

    @Test
    void calucuteSignOfTotal_Ok() {
        final var exercise202 = new Exercise202();

        assertEquals(10, exercise202.calucuteSignOfTotal(new int[]{2, 3, 3, 6, 8}));
        assertEquals(16, exercise202.calucuteSignOfTotal(new int[]{2, -3, 3, 6, 8}));
    }
}