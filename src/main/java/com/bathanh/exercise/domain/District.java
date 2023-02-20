package com.bathanh.exercise.domain;


import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data

public class District {
    private String id;
    private String name;
    Province province;
    @ToString.Exclude
    final List<Commune> communes = new ArrayList<>();
}
