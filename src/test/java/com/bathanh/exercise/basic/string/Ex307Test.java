package com.bathanh.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ex307Test {

    @Test
    void searchStringInString() {
        final var ex307 = new Ex307();

        assertTrue(ex307.searchStringInString("ef", "abcdef"));
        assertFalse(ex307.searchStringInString("abcdef", "h"));
        assertFalse(ex307.searchStringInString("abcdef", ""));
    }
}