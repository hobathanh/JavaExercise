package com.bathanh.exercise.collectionStream;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ExecutionFunction {

    public VietnamAddress parseJsonFile(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        VietnamAddress vietnamAddress = objectMapper.readValue(new File(filePath), VietnamAddress.class);
        return vietnamAddress;
    }
}
