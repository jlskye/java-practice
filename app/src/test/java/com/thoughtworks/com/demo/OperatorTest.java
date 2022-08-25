package com.thoughtworks.com.demo;

import org.junit.jupiter.api.Test;

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
}