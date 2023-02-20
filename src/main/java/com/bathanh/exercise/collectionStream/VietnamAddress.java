package com.bathanh.exercise.collectionStream;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class VietnamAddress {
    private List<ProvinceDTO> provinces;
    private List<DistrictDTO> districts;
    private List<CommuneDTO> communes;

}
