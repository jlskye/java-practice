package com.thoughtworks.com.demo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {
    @Test
    void should_find_student_with_list_successfully() {
        Student firstStu = new Student("stu1", 80);
        Student secondStu = new Student("stu2", 90);

        Students students = new Students(new ArrayList<Student>(List.of(firstStu, secondStu)));
        assertEquals(80, students.findStudentScoreInList("stu1"));
    }

    @Test
    void should_return_minus_one_when_find_student_fail() {
        Student firstStu = new Student("stu1", 80);
        Student secondStu = new Student("stu2", 90);

        Students students = new Students(new ArrayList<Student>(List.of(firstStu, secondStu)));
        assertEquals(-1, students.findStudentScoreInList("stu3"));
    }
}