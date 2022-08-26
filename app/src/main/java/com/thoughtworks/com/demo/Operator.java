package com.thoughtworks.com.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toCollection;

public class Operator {
    public List<String> castListUpperCase(ArrayList<String> list) {
        return list.stream().map(String::toUpperCase).collect(toCollection(ArrayList::new));
    }


    public LocalDate[] transferStringToDate(String[] time) {
        return Arrays.stream(time)
                .map(s -> s.replaceAll(" ", ""))
                .map(LocalDate::parse).toArray(LocalDate[]::new);
    }
}
