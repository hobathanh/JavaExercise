package com.bathanh.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex307Test {

    @Test
    void searchStringInString() {
        final var ex307 = new Ex307();

        assertEquals(2, ex307.findIndexOfString("ho ba thanh", " "));
        assertEquals(1, ex307.findIndexOfString("ho ba thanh", "o"));
        assertEquals(0, ex307.findIndexOfString("ho ba thanh", "ho"));
        assertEquals(-1, ex307.findIndexOfString("ho ba thanh", "tan"));
    }
}