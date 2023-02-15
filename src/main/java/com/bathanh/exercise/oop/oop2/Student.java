package com.bathanh.exercise.oop.oop2;

import java.time.LocalDate;

public class Student {

    private final String firstName;
    private final String lastName;
    private final LocalDate birthDay;
    private final String className;
    private final String address;
    private final Gender gender;
    private final String email;
    private final String phone;

    private Student(StudentBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.birthDay = builder.birthDay;
        this.className = builder.className;
        this.address = builder.address;
        this.gender = builder.gender;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getClassName() {
        return className;
    }

    public String getAddress() {
        return address;
    }

    public Gender getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Student: " + this.firstName + ", " + this.lastName + ", " + this.birthDay + ", "
                + this.className + ", " + this.address + ", " + this.gender + ", " + this.email + ", " + this.phone;
    }
}
