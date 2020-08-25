package com.kata.fun;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("FizzBuzzTest")
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void before() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    @DisplayName("should print 1 when given 1")
    void testWithNumberOne() {
        int input = 1;
        Assertions.assertEquals("1", fizzBuzz.proceed(input));
    }

    @Test
    @DisplayName("should print 2 when given 2")
    void testWithNumberTwo() {
        int input = 2;
        Assertions.assertEquals("2", fizzBuzz.proceed(input));
    }

    @Test
    @DisplayName("should print fizz when given 3")
    void testWithNumberThree() {
        int input = 3;
        Assertions.assertEquals("fizz", fizzBuzz.proceed(input));
    }

    @Test
    @DisplayName("Should print all numbers from 1 to 100")
    void testAll() {
        for (int i=1; i<101; i++) {
            System.out.println(fizzBuzz.proceed(i));
        }
    }

    @Test
    @DisplayName("should buzz when given 5")
    void testWithNumberFive() {
        int input = 5;
        Assertions.assertEquals("buzz", fizzBuzz.proceed(input));
    }

    @Test
    @DisplayName("should print fizzbuzz when given 15")
    void testWithNumberFifteen() {
        int input = 15;
        Assertions.assertEquals("fizzbuzz", fizzBuzz.proceed(input));
    }
}

