package com.bathanh.exercise.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class District {
    private String id;
    private String name;
    Province province;
    @ToString.Exclude
    final List<Commune> communes = new ArrayList<>();
}
