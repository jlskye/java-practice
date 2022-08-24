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
        for(Student student: this.list) {
            if (student.name.equals(name)) {
                return student.score;
            }
        }
        return -1;
    }

    public int getScore(String name) {
        Integer score = this.cache.get(name);
        if(score == null) {
            score = this.findStudentScoreInList(name);
            this.cache.put(name, score);
        }
        return score;
    }
}
