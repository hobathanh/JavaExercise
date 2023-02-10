package com.bathanh.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ex304Test {

    @Test
    void checkRepeatString() {
        final var ex304 = new Ex304();

        assertTrue(ex304.checkRepeatString("abcabcabc"));
        assertTrue(ex304.checkRepeatString("aaaaa"));
        assertFalse(ex304.checkRepeatString("abcefabc"));
        assertFalse(ex304.checkRepeatString("a"));
        assertFalse(ex304.checkRepeatString("aabb"));
    }
}