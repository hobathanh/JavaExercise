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

    public Student(String firstName, String lastName, LocalDate birthDay, String className, String address, Gender gender, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.className = className;
        this.address = address;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
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

    public String toString() {
        return "Student: " + firstName + " " + lastName + ", " + birthDay + ", " + className + ", " + address + ", " + gender + ", " + email + ", " + phone;
    }
}
