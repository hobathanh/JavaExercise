package com.bathanh.exercise.oop.oop3;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Student {
    private final String firstName;
    private final String lastName;
    private final LocalDate birthDay;
    private final String className;
    private final String address;
    private final Gender gender;
    private final String email;
    private final String phone;
}
