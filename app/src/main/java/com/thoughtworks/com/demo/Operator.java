package com.thoughtworks.com.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toCollection;

public class Operator {
    private final int minLength = 6;
    public List<String> castListUpperCase(ArrayList<String> list) {
        return list.stream().map(String::toUpperCase).collect(toCollection(ArrayList::new));
    }


    public LocalDate[] transferStringToDate(String[] time) {
        return Arrays.stream(time)
                .map(s -> s.replaceAll(" ", ""))
                .map(LocalDate::parse).toArray(LocalDate[]::new);
    }

    public boolean validatePassword(String yourSecret) {
        Optional<String> opt = Optional.ofNullable(yourSecret);
        return opt.filter(s -> s.length() > this.minLength).isPresent();
    }

    public static long calculateBigNumber(long n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n >= 20) {
            throw new ArithmeticException();
        }

        long r = 1;
        for (long i = 1; i <= n; i++) {
            r = r * i;
        }
        return r;
    }

    public String capitalizeString(String input) {
        return Character.toUpperCase(input.charAt(0)) + input.substring(1).toLowerCase();
    }
}
