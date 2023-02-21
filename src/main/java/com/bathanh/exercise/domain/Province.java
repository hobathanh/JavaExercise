package com.bathanh.exercise.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Province {
    private String id;
    private String name;
    @ToString.Exclude
    final List<District> districts = new ArrayList<>();
}
