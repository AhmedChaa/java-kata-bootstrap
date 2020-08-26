package com.kata.fun;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("OddOrEvenTest")
public class OddOrEvenTest {

    @Test
    @DisplayName("should print even when given [0]")
    void testWithArrayOfZero() {
        Integer[] input =  {0};
        OddOrEven oddOrEven = new OddOrEven();
        Assertions.assertEquals("even", oddOrEven.proceed(input));
    }

    @Test
    @DisplayName("should print odd when given ([0, 1, 4])")
    void testWithArrayOfOddElements() {
        Integer[] input =  {0, 1, 4};
        OddOrEven oddOrEven = new OddOrEven();
        Assertions.assertEquals("odd", oddOrEven.proceed(input));
    }

    @Test
    @DisplayName("should print odd when given ([0, -1, -5])")
    void testWithArrayOfEvenElements() {
        Integer[] input =  {0, -1, -5};
        OddOrEven oddOrEven = new OddOrEven();
        Assertions.assertEquals("even", oddOrEven.proceed(input));
    }
}
