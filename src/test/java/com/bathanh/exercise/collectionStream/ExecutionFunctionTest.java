package com.bathanh.exercise.collectionStream;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExecutionFunctionTest {


    @Test
    void parseJsonFile_Ok() throws IOException {
        final var executionFunction = new ExecutionFunction();
        final VietnamAddress vietnamAddress = executionFunction.parseVietnameseAddress();

        assertEquals(63, vietnamAddress.getProvinces().size());
        assertEquals(705, vietnamAddress.getDistricts().size());
        assertEquals(10604, vietnamAddress.getCommunes().size());

        ProvinceDTO provinceDTO = vietnamAddress.getProvinces().get(0);
        assertEquals("01", provinceDTO.getIdProvince().toString());
        assertEquals("Thành phố Hà Nội", provinceDTO.getName());

        DistrictDTO districtDTO = vietnamAddress.getDistricts().get(0);
        assertEquals("01", districtDTO.getIdProvince());
        assertEquals("001", districtDTO.getIdDistrict());
        assertEquals("Quận Ba Đình", districtDTO.getName());

        CommuneDTO communeDTO = vietnamAddress.getCommunes().get(0);
        assertEquals("001", communeDTO.getIdDistrict());
        assertEquals("00001", communeDTO.getIdCommune());
        assertEquals("Phường Phúc Xá", communeDTO.getName());
    }

    @Test
    void findVietnamAddressByCommune_Ok() throws IOException {
        final var executionFunction = new ExecutionFunction();

        assertTrue(executionFunction.findVietnamAddressByCommune("Phúc Thành")
                .containsAll(executionFunction.findVietnamAddressByCommune("Phúc Thành")));
        assertTrue(executionFunction.findVietnamAddressByCommune("Phúc Xá")
                .contains("Phường Phúc Xá, Quận Ba Đình, Thành phố Hà Nội"));
        assertTrue(executionFunction.findVietnamAddressByCommune("123").isEmpty());
    }
}