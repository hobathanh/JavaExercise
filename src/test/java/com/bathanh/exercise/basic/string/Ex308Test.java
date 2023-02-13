package com.bathanh.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ex308Test {

    @Test
    void checkString_Ok() {
        final var ex308 = new Ex308();

        assertTrue(ex308.checkString("()()()"));
        assertTrue(ex308.checkString("(())"));
        assertTrue(ex308.checkString("(((())))()()"));
        assertFalse(ex308.checkString("("));
        assertFalse(ex308.checkString(")"));
        assertFalse(ex308.checkString("()("));
        assertFalse(ex308.checkString(")()"));
        assertFalse(ex308.checkString(")("));
    }
}