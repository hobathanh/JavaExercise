package com.bathanh.exercise.oop.oop2;

import java.time.LocalDate;

public class StudentConcreteBuilder implements StudentBuilder {
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private String className;
    private String address;
    private Gender gender;
    private String email;
    private String phone;

    @Override
    public StudentBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public StudentBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public StudentBuilder setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
        return this;
    }

    @Override
    public StudentBuilder setClassName(String className) {
        this.className = className;
        return this;
    }

    @Override
    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public StudentBuilder setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public StudentBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public Student build() {
        return new Student(firstName, lastName, birthDay, className, address, gender, email, phone);
    }

}
