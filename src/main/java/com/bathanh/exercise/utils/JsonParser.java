package com.bathanh.exercise.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.experimental.UtilityClass;

import java.io.File;
import java.io.IOException;

@UtilityClass
public class JsonParser {
    public static <T> T parseJsonFile(final Class<T> targetClass, final String filePath) throws IOException {
        final var objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File(filePath), targetClass);
    }
}
