package com.bathanh.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Ex306Test {

    @Test
    void calculateBarcode() {
        final var ex306 = new Ex306();

        assertThrows(IllegalArgumentException.class, () -> ex306.calculateBarcode("1213213"));
        assertEquals(4, ex306.calculateBarcode("893850597419"));
        assertEquals(5, ex306.calculateBarcode("123456789000"));
        assertEquals(0, ex306.calculateBarcode("623456789000"));
    }
}