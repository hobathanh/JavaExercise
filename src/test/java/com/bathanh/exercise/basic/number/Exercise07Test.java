package com.bathanh.exercise.basic.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise07Test {

    @Test
    void calculateEqual_Ok() {
        final var Exercise07 = new Exercise07();

        assertEquals("153 , 370 , 371 , 407 , 1634 , 8208 , 9474 , 54748 , 92727 , 93084", Exercise07.calculateEqual());
    }

    @Test
    void sumNumber_Ok() {
        final var Exercise07 = new Exercise07();

        assertEquals(13, Exercise07.sumNumber(23));
    }
    @Test
    void numberOfDigits_Ok(){
        final var Exercise07 = new Exercise07();

        assertEquals(2, Exercise07.numberOfDigits(23));
    }
}