package com.bathanh.exercise.collectionStream;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class VietnameseAddress {
    private List<Province> provinces;
    private List<District> Districts;
    private List<Commune> Communes;

}
