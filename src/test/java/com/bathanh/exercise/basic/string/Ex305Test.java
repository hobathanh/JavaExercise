package com.bathanh.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ex305Test {

    @Test
    void checkBarcode() {
        final var ex305 = new Ex305();

        assertFalse(ex305.checkBarcode("123456789123456789"));
        assertFalse(ex305.checkBarcode("12345"));
        assertFalse(ex305.checkBarcode("1234567891234"));
        assertTrue(ex305.checkBarcode("8938505974194"));
    }
}