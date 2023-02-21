package com.bathanh.exercise.collectionStream;

import lombok.Getter;

import java.util.List;

@Getter
public class VietnamAddress {
    private List<ProvinceDTO> provinces;
    private List<DistrictDTO> districts;
    private List<CommuneDTO> communes;

}
