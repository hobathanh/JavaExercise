package com.bathanh.exercise.domain;

import lombok.Data;

@Data

public class Commune {
    String id;
    String name;
    District district;
}
