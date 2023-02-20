package com.bathanh.exercise.collectionStream;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExecutionFunctionTest {

    @Test
    void parseJsonFile_Ok() throws IOException {
        final ExecutionFunction executionFunction = new ExecutionFunction();
        final String filePath = "C:\\Users\\hobat\\IdeaProjects\\JavaExercise\\src\\main\\data.json";

        VietnamAddress vietnamAddress = executionFunction.parseJsonFile(filePath);
        assertEquals(executionFunction.parseJsonFile(filePath).toString(), vietnamAddress.toString());

        assertEquals(63, vietnamAddress.getProvinces().size());
        assertEquals(705, vietnamAddress.getDistricts().size());
        assertEquals(10604, vietnamAddress.getCommunes().size());
        
        Province province = vietnamAddress.getProvinces().get(0);
        assertEquals("01", province.getIdProvince().toString());
        assertEquals("Thành phố Hà Nội", province.getName());

        District district = vietnamAddress.getDistricts().get(0);
        assertEquals("01", district.getIdProvince());
        assertEquals("001", district.getIdDistrict());
        assertEquals("Quận Ba Đình", district.getName());

        Commune commune = vietnamAddress.getCommunes().get(0);
        assertEquals("001", commune.getIdDistrict());
        assertEquals("00001", commune.getIdCommune());
        assertEquals("Phường Phúc Xá", commune.getName());
    }
}