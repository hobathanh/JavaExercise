package com.bathanh.exercise.basic.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex310Test {

    @Test
    void deleteSpaceString() {
        final var ex310 = new Ex310();

        assertEquals("ho ba thanh", ex310.deleteSpaceString(" ho      ba thanh   "));
    }
}