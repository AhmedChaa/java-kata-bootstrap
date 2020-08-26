package com.kata.fun;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@DisplayName("PrimeFactorsTest")
public class PirmeFactorsTest {

    private List<Integer> list() {
        return new ArrayList<>();
    }

    @Test
    public void testOne() {
        Assertions.assertEquals(list(),PrimeFactors.generate(1));
    }
}
