package com.bathanh.exercise.domain;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data

public class Province {
    String id;
    String name;
    @ToString.Exclude
    List<District> districts = new ArrayList<>();
}
