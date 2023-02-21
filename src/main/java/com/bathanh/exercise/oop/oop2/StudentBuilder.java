package com.bathanh.exercise.oop.oop2;

import java.time.LocalDate;

public interface StudentBuilder {
    StudentBuilder setFirstName(String firstName);

    StudentBuilder setLastName(String lastName);

    StudentBuilder setBirthDay(LocalDate birthDay);

    StudentBuilder setClassName(String className);

    StudentBuilder setAddress(String address);

    StudentBuilder setGender(Gender gender);

    StudentBuilder setEmail(String email);

    StudentBuilder setPhone(String phone);

    Student build();
}
