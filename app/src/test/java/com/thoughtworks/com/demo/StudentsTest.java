package com.thoughtworks.com.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {
    Student firstStu;
    Student secondStu;

    @BeforeEach
    void setUp() {
        firstStu = new Student("stu1", 80);
        secondStu = new Student("stu2", 90);
    }

    @Test
    void should_find_student_with_list_successfully() {
        Students students = new Students(new ArrayList<>(List.of(firstStu, secondStu)));
        assertThat(students.findStudentScoreInList("stu1")).isEqualTo(80);
    }

    @Test
    void should_return_minus_one_when_find_student_fail() {
        Students students = new Students(new ArrayList<>(List.of(firstStu, secondStu)));
        assertThat(students.findStudentScoreInList("stu3")).isEqualTo(-1);
    }

    @Test
    void should_get_student_score_successfully() {
        Students students = new Students(new ArrayList<>(List.of(firstStu, secondStu)));
        assertThat(students.getScore("stu1")).isEqualTo(80);
    }
    @Test
    void should_return_minus_one_when_student_not_exist() {
        Students students = new Students(new ArrayList<>(List.of(firstStu, secondStu)));
        assertThat(students.getScore("stu3")).isEqualTo(-1);
    }
}