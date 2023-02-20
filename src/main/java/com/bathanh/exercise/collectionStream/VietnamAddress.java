package com.bathanh.exercise.collectionStream;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class VietnamAddress {
    private List<Province> provinces;
    private List<District> districts;
    private List<Commune> communes;

}
