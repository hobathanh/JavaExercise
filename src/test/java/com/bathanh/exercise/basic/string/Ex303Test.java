package com.bathanh.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex303Test {

    @Test
    void sumAllNumberString() {
        final var ex303 = new Ex303();

        assertEquals(10, ex303.sumAllNumberString("2abada3.5da"));
        assertEquals(380, ex303.sumAllNumberString("abc 123 def 33 mn 3.221"));
    }
}