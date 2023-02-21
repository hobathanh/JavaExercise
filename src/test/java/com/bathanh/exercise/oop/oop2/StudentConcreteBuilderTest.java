package com.bathanh.exercise.oop.oop2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentConcreteBuilderTest {

    final StudentBuilder studentBuilder = new StudentConcreteBuilder();

    @Test
    void setFirstName() {
        studentBuilder.setFirstName("Ho");
        assertEquals("Ho", studentBuilder.build().getFirstName());
    }

    @Test
    void setLastName() {
        studentBuilder.setLastName("Ba Thanh");
        assertEquals("Ba Thanh", studentBuilder.build().getLastName());
    }

    @Test
    void setBirthDay() {
        studentBuilder.setBirthDay(LocalDate.of(2001, 9, 29));
        assertEquals(LocalDate.of(2001, 9, 29), studentBuilder.build().getBirthDay());
    }

    @Test
    void setClassName() {
        studentBuilder.setClassName("A");
        assertEquals("A", studentBuilder.build().getClassName());
    }

    @Test
    void setAddress() {
        studentBuilder.setAddress("Nghe An");
        assertEquals("Nghe An", studentBuilder.build().getAddress());
    }

    @Test
    void setGender() {
        studentBuilder.setGender(Gender.MALE);
        assertEquals(Gender.MALE, studentBuilder.build().getGender());
    }

    @Test
    void setEmail() {
        studentBuilder.setEmail("hobathanh201@gmail.com");
        assertEquals("hobathanh201@gmail.com", studentBuilder.build().getEmail());
    }

    @Test
    void setPhone() {
        studentBuilder.setPhone("06969696969");
        assertEquals("06969696969", studentBuilder.build().getPhone());
    }
}