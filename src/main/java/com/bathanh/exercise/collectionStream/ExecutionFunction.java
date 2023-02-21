package com.bathanh.exercise.collectionStream;

import com.bathanh.exercise.domain.Commune;
import com.bathanh.exercise.domain.District;
import com.bathanh.exercise.domain.Province;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.bathanh.exercise.utils.JsonParser.parseJsonFile;

public class ExecutionFunction {

    public VietnamAddress parseVietnameseAddress() throws IOException {
        return parseJsonFile(VietnamAddress.class, "data.json");
    }

    public List<String> findVietnamAddressByCommune(final String communeName) throws IOException {
        final List<String> result = new ArrayList<>();

        var provinces = parseVietnameseAddress().getProvinces().stream().map(provinceDTO -> {
            var province = new Province();
            province.setId(provinceDTO.getIdProvince());
            province.setName(provinceDTO.getName());
            return province;
        }).toList();


        var districts = parseVietnameseAddress().getDistricts().stream().map(districtDTO -> {
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
        }).toList();

        var communes = parseVietnameseAddress().getCommunes().stream().map(communeDTO -> {
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
        }).toList();

        communes.stream().filter(commune -> commune.getName().contains(communeName)).forEach(commune -> {
            var output = String.format("%s, %s, %s"
                    , commune.getName()
                    , commune.getDistrict().getName()
                    , commune.getDistrict().getProvince().getName());
            result.add(output);
        });

        return result;
    }
}
