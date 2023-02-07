package com.bathanh.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex204Test {

    @Test
    void findMaxLengthArray_Ok() {
        final var ex204 = new Ex204();

        assertEquals("1, 3, 4, 5", ex204.findMaxLengthArray(new int[]{1, 3, 4, 5, 2, 6}));
    }
}