package com.central1.interview.c1interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringToIntegerQuestionTest {

    @Test
    public void test1234() {
        assertEquals(1234, StringToIntegerQuestion.MyFunction("1234"));
    }

    @Test
    public void test100() {
        assertEquals(100, StringToIntegerQuestion.MyFunction("100"));
    }
}