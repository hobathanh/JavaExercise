package com.bathanh.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex305Test {

    @Test
    void checkBarcode() {
        final var ex305 = new Ex305();

        assertEquals(false, ex305.checkBarcode("123456789123456789"));
        assertEquals(false, ex305.checkBarcode("12345"));
        assertEquals(false, ex305.checkBarcode("1234567891234"));
        assertEquals(true, ex305.checkBarcode("8938505974194"));
    }
}