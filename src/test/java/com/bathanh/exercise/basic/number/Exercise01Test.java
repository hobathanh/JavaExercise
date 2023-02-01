package com.bathanh.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise01Test {


    @Test
    void Subtract_OK() {
        final var Exercise01 = new Exercise01();

        assertEquals(15, Exercise01.subtract(19, 4));
        assertEquals(13, Exercise01.subtract(18, 5));
    }
}