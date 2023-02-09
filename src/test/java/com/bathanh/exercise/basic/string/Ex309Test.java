package com.bathanh.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex309Test {

    @Test
    void formatString() {
        final var ex309 = new Ex309();

        assertEquals("Ho Ba Thanh", ex309.formatString("ho bA tHANH"));
    }
}