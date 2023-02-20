package com.bathanh.exercise.collectionStream;

import com.bathanh.exercise.domain.Commune;
import com.bathanh.exercise.domain.District;
import com.bathanh.exercise.domain.Province;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExecutionFunction {

    final String filePath = "C:\\Users\\hobat\\IdeaProjects\\JavaExercise\\src\\main\\data.json";

    public VietnamAddress parseJsonFile(final String filePath) throws IOException {
        final var objectMapper = new ObjectMapper();
        VietnamAddress vietnamAddress = objectMapper.readValue(new File(filePath), VietnamAddress.class);
        return vietnamAddress;
    }

    public List<String> findVietnamAddressByCommune(final String communeName) throws IOException {
        final List<String> result = new ArrayList<>();
        final var objectMapper = new ObjectMapper();
        VietnamAddress vietnamAddress = objectMapper.readValue(new File(filePath), VietnamAddress.class);

        var provinces = vietnamAddress.getProvinces().stream().map(provinceDTO -> {
            var province = new Province();
            province.setId(provinceDTO.getIdProvince());
            province.setName(provinceDTO.getName());
            return province;
        }).collect(Collectors.toList());


        var districts = vietnamAddress.getDistricts().stream().map(districtDTO -> {
            var district = new District();
            district.setId(districtDTO.getIdDistrict());
            district.setName(districtDTO.getName());
            provinces.stream().filter(province ->
                    districtDTO.getIdProvince().equals(province.getId())
            ).findFirst().ifPresent(province -> {
                district.setProvince(province);
                province.getDistricts().add(district);
            });
            return district;
        }).collect(Collectors.toList());

        var communes = vietnamAddress.getCommunes().stream().map(communeDTO -> {
            var commune = new Commune();
            commune.setId(communeDTO.getIdCommune());
            commune.setName(communeDTO.getName());
            districts.stream().filter(district ->
                    communeDTO.getIdDistrict().equals(district.getId())
            ).findFirst().ifPresent(district -> {
                commune.setDistrict(district);
                district.getCommunes().add(commune);
            });
            return commune;
        }).collect(Collectors.toList());


        communes.stream().filter(commune -> commune.getName().contains(communeName)).forEach(commune -> {
            var mess = String.format("%s, %s, %s"
                    , commune.getName()
                    , commune.getDistrict().getName()
                    , commune.getDistrict().getProvince().getName());
            result.add(mess);
        });

        return result;
    }
}
