package com.bathanh.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Ex210Test {

    @Test
    void reverseArray_Ok() {
        final var ex210 = new Ex210();

        assertArrayEquals(new int[]{5, 3, 4, 1, -1}, ex210.reverseArray(new int[]{-1, 1, 4, 3, 5}));
    }
}