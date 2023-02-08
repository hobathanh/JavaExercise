package com.bathanh.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex301Test {

    @Test
    void reverseString() {
        final var ex301 = new Ex301();

        assertEquals("fedcba", ex301.reverseString("abcdef"));
    }
}