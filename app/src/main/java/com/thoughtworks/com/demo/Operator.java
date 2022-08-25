package com.thoughtworks.com.demo;

import java.util.ArrayList;

import static java.util.stream.Collectors.toCollection;

public class Operator {


    public ArrayList castListUpperCase(ArrayList<String> list) {
        return list.stream().map(String::toUpperCase).collect(toCollection(ArrayList::new));
    }
}
