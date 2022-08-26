package com.thoughtworks.com.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class OperatorTest {
    Operator operator;
    @BeforeEach
    void setUp() {
        this.operator = new Operator();
    }

    @AfterEach
    void tearDown() {
        this.operator = null;
    }

    @Test
    void should_return_correct_result_when_use_uppercase_operation() {
        var list = new ArrayList(List.of("sdd", "sdd2w"));
        var list2 = new ArrayList(List.of("SDD", "SDD2W"));
        assertThat(this.operator.castListUpperCase(list)).isEqualTo(list2);
    }

    @Test
    void should_parse_string_to_local_date_successfully() {
        String[] time = new String[] {" 2019-12-31 ", "2020 - 01-09 ", "2020- 05 - 01 ", "2022 - 02 - 01",
                " 2025-01 -01" };
        LocalDate date1 = LocalDate.of(2019, 12, 31);
        LocalDate date2 = LocalDate.of(2020, 01, 9);
        LocalDate date3 = LocalDate.of(2020, 05, 1);
        LocalDate date4 = LocalDate.of(2022, 02, 1);
        LocalDate date5 = LocalDate.of(2025, 01, 1);

        assertThat(this.operator.transferStringToDate(time)).isEqualTo(new LocalDate[]{
                date1, date2,date3,date4,date5});
    }

    @Test
    void should_validate_success_when_password_length_is_8() {
        assertThat(this.operator.validatePassword("yourSecret")).isEqualTo(true);
    }

    @Test
    void should_throw_exception_when_argument_is_larger_than_20() {
        long number = 20;
        assertThatThrownBy(() -> {
            this.operator.calculateBigNumber(number);
        }).isInstanceOf(ArithmeticException.class);
    }

    @Test
    void should_throw_exception_when_argument_is_less_than_0() {
        long number = -1;
        assertThatThrownBy(() -> {
            this.operator.calculateBigNumber(number);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/test-capitalize.csv")
    void should_change_string_to_capitalize(String input, String output) {
        assertThat(this.operator.capitalizeString(input)).isEqualTo(output);
    }

    static List<Arguments> should_double_number_successfully() {
        return List.of(
                Arguments.of(1, 2),
                Arguments.of(2, 4),
                Arguments.of(3, 6),
                Arguments.of(4, 8),
                Arguments.of(5, 10)
        );
    }
    @ParameterizedTest
    @MethodSource
    void should_double_number_successfully(int input, int output) {
        assertThat(this.operator.doubleNumber(input)).isEqualTo(output);
    }
}