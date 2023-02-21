package com.bathanh.exercise.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.experimental.UtilityClass;

import java.io.IOException;
import java.io.InputStream;

@UtilityClass
public class JsonParser {
    public static <T> T parseJsonFile(final Class<T> targetClass, final String fileName) throws IOException {
        ClassLoader classLoader = JsonParser.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);
        final var objectMapper = new ObjectMapper();
        return objectMapper.readValue(inputStream, targetClass);
    }
}
