package com.bathanh.exercise.domain;

import lombok.Getter;
import lombok.Setter;

;

@Getter
@Setter
public class Commune {
    private String id;
    private String name;
    District district;


}
