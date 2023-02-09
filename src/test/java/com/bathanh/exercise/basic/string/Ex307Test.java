package com.bathanh.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex307Test {

    @Test
    void searchStringInString() {
        final var ex307 = new Ex307();

        assertEquals(true, ex307.searchStringInString("ef", "abcdef"));
        assertEquals(false, ex307.searchStringInString("abcdef", "h"));
    }
}