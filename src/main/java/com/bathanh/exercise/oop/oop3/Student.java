package com.bathanh.exercise.oop.oop3;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class Student {
    private final String firstName;
    private final String lastName;
    private final LocalDate birthday;
    private final String className;
    private final String address;
    private final Gender gender;
    private final String email;
    private final String phone;
}
