package com.bathanh.exercise.utils;

import com.bathanh.exercise.domain.District;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

class JsonParserTest {
    @Test
    void parseJsonFile() throws IOException {
        assertThrows(IOException.class, () -> {
            JsonParser.parseJsonFile(District.class, "data.json");
        });
    }
}