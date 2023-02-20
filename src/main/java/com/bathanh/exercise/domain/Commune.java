package com.bathanh.exercise.domain;

import lombok.Data;

@Data

public class Commune {
    private String id;
    private String name;
    District district;
}
