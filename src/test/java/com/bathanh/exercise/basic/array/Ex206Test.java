package com.bathanh.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex206Test {

    @Test
    void findIndexNumberBinarySearch_Ok() {

        final var ex206 = new Ex206();

        assertEquals(3, ex206.findIndexNumberBinarySearch(new int[]{1, -2, 3, 54, 12}, 54));
        assertEquals(-1, ex206.findIndexNumberBinarySearch(new int[]{1, -2, 3, 54, 12}, 29));
    }
}