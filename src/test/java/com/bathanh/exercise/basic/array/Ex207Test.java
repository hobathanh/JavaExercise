package com.bathanh.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex207Test {

    @Test
    void sortArrayAsc_Ok() {
        final var ex207 = new Ex207();

        assertEquals("1, 2, 3, 6, 7", ex207.sortArrayAsc(new int[]{1, 2, 6, 7}, 3));
        assertEquals("2, 3, 5, 6, 7", ex207.sortArrayAsc(new int[]{3, 5, 6, 7}, 2));
        assertEquals("1, 2, 2, 3, 6", ex207.sortArrayAsc(new int[]{1, 2, 3, 6}, 2));
        assertEquals("1, 2, 3, 6, 8", ex207.sortArrayAsc(new int[]{1, 2, 3, 6}, 8));
    }
}