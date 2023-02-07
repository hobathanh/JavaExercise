package com.bathanh.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex205Test {

    @Test
    void findDifferenceMaxAndMin_Ok() {
        final var ex205 = new Ex205();

        assertEquals(55, ex205.findDifferenceMaxAndMin(new int[]{1, 3, -5, 50, 9}));
    }
}