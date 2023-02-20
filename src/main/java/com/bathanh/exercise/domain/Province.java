package com.bathanh.exercise.domain;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data

public class Province {
    private String id;
    private String name;
    @ToString.Exclude
    final List<District> districts = new ArrayList<>();
}
