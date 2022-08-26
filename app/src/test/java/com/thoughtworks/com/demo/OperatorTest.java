package com.thoughtworks.com.demo;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class OperatorTest {
    @Test
    void should_return_correct_result_when_use_uppercase_operation() {
        Operator operator = new Operator();
        ArrayList list = new ArrayList(List.of("sdd", "sdd2w"));
        ArrayList list2 = new ArrayList(List.of("SDD", "SDD2W"));
        assertThat(operator.castListUpperCase(list)).isEqualTo(list2);
    }

    @Test
    void should_parse_string_to_local_date_successfully() {
        Operator operator = new Operator();
        String[] time = new String[] {" 2019-12-31 ", "2020 - 01-09 ", "2020- 05 - 01 ", "2022 - 02 - 01",
                " 2025-01 -01" };
        LocalDate date1 = LocalDate.of(2019, 12, 31);
        LocalDate date2 = LocalDate.of(2020, 01, 9);
        LocalDate date3 = LocalDate.of(2020, 05, 1);
        LocalDate date4 = LocalDate.of(2022, 02, 1);
        LocalDate date5 = LocalDate.of(2025, 01, 1);

        assertThat(operator.transferStringToDate(time)).isEqualTo(new LocalDate[]{
                date1, date2,date3,date4,date5});
    }
}