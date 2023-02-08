package com.bathanh.exercise.basic.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex304Test {

    @Test
    void checkRepeatString() {
        final var ex304 = new Ex304();

        assertEquals(true, ex304.checkRepeatString("abcefafabc"));
        assertEquals(true, ex304.checkRepeatString("abac"));
        assertEquals(true, ex304.checkRepeatString(" ab c"));
        assertEquals(false, ex304.checkRepeatString("abc"));
    }
}