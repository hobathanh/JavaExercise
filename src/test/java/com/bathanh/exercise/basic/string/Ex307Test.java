package com.bathanh.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex307Test {

    @Test
    void searchStringInString() {
        final var ex307 = new Ex307();

        assertEquals(2, ex307.findIndexStringInString("oiutytre", "utyt"));
        assertEquals(2, ex307.findIndexStringInString("utyt", "oiutytredajhfsafjvajf"));
        assertEquals(1, ex307.findIndexStringInString("toabcd", "oa"));
        assertEquals(0, ex307.findIndexStringInString("todyyyabcd", "t"));
        assertEquals(0, ex307.findIndexStringInString("t", "todyyyabcd"));
        assertEquals(-1, ex307.findIndexStringInString("dadasda", "k"));
    }
}