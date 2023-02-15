package com.bathanh.exercise.oop.oop2;

import java.time.LocalDate;

public class StudentBuilder {

    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private String gender;
    private boolean isGraduate;
    private boolean hasExperience;
    private String city;
    private String state;
    private boolean isEarning;

    public StudentBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public StudentBuilder addAge(String age) {
        this.age = age;
        return this;
    }

    public StudentBuilder addGender(String gender) {
        this.gender = gender;
        return this;
    }

    public StudentBuilder addisGraduate(boolean isGraduate) {
        this.isGraduate = isGraduate;
        return this;
    }

    public StudentBuilder addHasExperience(boolean hasExperience) {
        this.hasExperience = hasExperience;
        return this;
    }

    public StudentBuilder addCity(String city) {
        this.city = city;
        return this;
    }

    public StudentBuilder addState(String state) {
        this.state = state;
        return this;
    }

    public StudentBuilder addIsEarning(boolean isEarning) {
        this.isEarning = isEarning;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}
