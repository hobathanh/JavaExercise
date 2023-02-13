package com.bathanh.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Ex307Test {

    @Test
    void searchStringInString() {
        final var ex307 = new Ex307();

        assertEquals(2, ex307.findIndexStringInString("utyt", "oiutytre"));
        assertEquals(1, ex307.findIndexStringInString("o", "toabcd"));
        assertThrows(IllegalArgumentException.class, () -> ex307.findIndexStringInString("gdgdg", "d"));
        assertThrows(IllegalArgumentException.class, () -> ex307.findIndexStringInString("k", "dadasda"));
    }
}