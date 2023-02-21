package com.bathanh.exercise.oop.oop3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    void studentTest() {
        final var student = Student.builder()
                .firstName("Ho")
                .lastName("Ba Thanh")
                .address("Nghe An")
                .birthday(LocalDate.of(2001, 9, 29))
                .phone("069696969")
                .gender(Gender.MALE)
                .className("A")
                .email("hobathanh201@gmail.com")
                .build();

        assertEquals("Ho", student.getFirstName());
        assertEquals("Ba Thanh", student.getLastName());
        assertEquals("Nghe An", student.getAddress());
        assertEquals(LocalDate.of(2001, 9, 29), student.getBirthday());
        assertEquals("069696969", student.getPhone());
        assertEquals(Gender.MALE, student.getGender());
        assertEquals("A", student.getClassName());
        assertEquals("hobathanh201@gmail.com", student.getEmail());
    }
}