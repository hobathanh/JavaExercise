package com.bathanh.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise201Test {

    @Test
    void searchArrayLargest_Ok() {
        final var exercise201 = new Exercise201();

        assertEquals(400, exercise201.searchArrayLargest(new int[]{-90, 20, 400, 100}));
    }
}