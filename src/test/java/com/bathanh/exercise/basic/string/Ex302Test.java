package com.bathanh.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ex302Test {

    @Test
    void checkSymmetricString_Ok() {
        final var ex302 = new Ex302();

        assertTrue(ex302.checkSymmetricString("abba"));
        assertTrue(ex302.checkSymmetricString("abdba"));
        assertTrue(ex302.checkSymmetricString("0"));
        assertTrue(ex302.checkSymmetricString(""));
        assertFalse(ex302.checkSymmetricString("abcabc"));
    }
}