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
    public StudentBuilder setFirstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public StudentBuilder setLastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public StudentBuilder setBirthDay(final LocalDate birthDay) {
        this.birthDay = birthDay;
        return this;
    }

    @Override
    public StudentBuilder setClassName(final String className) {
        this.className = className;
        return this;
    }

    @Override
    public StudentBuilder setAddress(final String address) {
        this.address = address;
        return this;
    }

    @Override
    public StudentBuilder setGender(final Gender gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public StudentBuilder setEmail(final String email) {
        this.email = email;
        return this;
    }

    @Override
    public StudentBuilder setPhone(final String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public Student build() {
        return new Student(firstName, lastName, birthDay, className, address, gender, email, phone);
    }

}
