package com.thoughtworks.com.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Students {
    List<Student> list;
    Map<String, Integer> cache;

    public Students(List<Student> list) {
        this.list = list;
        this.cache = new HashMap<>();
    }

    public int findStudentScoreInList(String name) {
        for(Student s: this.list) {
            if (s.name.equals(name)) {
                return s.score;
            }
        }
        return -1;
    }
}
