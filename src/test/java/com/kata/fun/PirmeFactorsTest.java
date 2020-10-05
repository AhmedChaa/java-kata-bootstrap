package com.kata.fun;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kata.fun.PrimeFactors.generate;

@DisplayName("PrimeFactorsTest")
public class PirmeFactorsTest {

    private List<Integer> list(int... ints) {
        List<Integer> list = new ArrayList<>();
        for (int i : ints)
            list.add(i);
        return list;
    }

    @Test
    public void testOne() {
        Assertions.assertEquals(list(), generate(1));
    }

    @Test
    public void testTwo() {
        Assertions.assertEquals(list(2), generate(2));
    }

    @Test
    public void testThree() {
        Assertions.assertEquals(list(3), generate(3));
    }

    @Test
    public void testFour() {
        Assertions.assertEquals(list(2, 2), generate(4));
    }

    @Test
    public void testFive() {
        Assertions.assertEquals(list(5), generate(5));
    }

    @Test
    public void testSix() {
        Assertions.assertEquals(list(2, 3), generate(6));
    }

    @Test
    public void testEight() {
        Assertions.assertEquals(list(2, 2, 2), generate(8));
    }

    @Test
    public void testSeven() {
        Assertions.assertEquals(list(7), generate(7));
    }

    @Test
    public void testNine() {
        Assertions.assertEquals(list(3, 3), generate(9));
    }

    @Test
    public void testTen() {
        Assertions.assertEquals(list(2, 5), generate(10));
    }

    @Test
    public void testTwenty() {
        Assertions.assertEquals(list(2, 2, 5), generate(20));
    }

    @Test
    public void testTwentyOne() {
        Assertions.assertEquals(list(3, 7), generate(21));
    }

}
