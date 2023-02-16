package com.bathanh.exercise.oop.oop2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
    final StudentBuilder studentBuilder = new StudentConcreteBuilder()
            .setFirstName("Ho")
            .setLastName("Ba Thanh")
            .setAddress("Nghe An")
            .setClassName("A")
            .setEmail("hobathanh201@gmail.com")
            .setBirthDay(LocalDate.of(2001, 9, 29))
            .setPhone("06969696969")
            .setGender(Gender.MALE);

    @Test
    void getFirstName() {
        assertEquals("Ho", studentBuilder.build().getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Ba Thanh", studentBuilder.build().getLastName());
    }

    @Test
    void getBirthDay() {
        assertEquals(LocalDate.of(2001, 9, 29), studentBuilder.build().getBirthDay());
    }


    @Test
    void getClassName() {
        assertEquals("A", studentBuilder.build().getClassName());
    }

    @Test
    void getAddress() {
        assertEquals("Nghe An", studentBuilder.build().getAddress());
    }

    @Test
    void getGender() {
        assertEquals(Gender.MALE, studentBuilder.build().getGender());
    }

    @Test
    void getEmail() {
        assertEquals("hobathanh201@gmail.com", studentBuilder.build().getEmail());
    }


    @Test
    void getPhone() {
        assertEquals("06969696969", studentBuilder.build().getPhone());
    }

    @Test
    void testToString() {
        assertEquals("Student: Ho Ba Thanh, 2001-09-29, A, Nghe An, MALE, hobathanh201@gmail.com, 06969696969", studentBuilder.build().toString());
    }
}