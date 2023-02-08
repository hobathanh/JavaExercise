package com.bathanh.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex302Test {

    @Test
    void checkSymmetricString_Ok() {
        final var ex302 = new Ex302();

        assertEquals(true, ex302.checkSymmetricString("abba"));
        assertEquals(true, ex302.checkSymmetricString("abdba"));
        assertEquals(true, ex302.checkSymmetricString("0"));
        assertEquals(false, ex302.checkSymmetricString(""));
        assertEquals(false, ex302.checkSymmetricString("abcabc"));
    }
}