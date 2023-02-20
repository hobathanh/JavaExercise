package com.bathanh.exercise.domain;


import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data

public class District {
    String id;
    String name;
    Province province;
    @ToString.Exclude
    List<Commune> communes = new ArrayList<>();
}
