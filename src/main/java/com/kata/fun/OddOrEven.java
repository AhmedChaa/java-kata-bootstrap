package com.kata.fun;

public class OddOrEven {
    public String proceed(Integer[] input) {
        Integer sum = 0;
        for (Integer i : input) {
            sum += i;
        }
        return (sum % 2 == 0) ? "even" : "odd";
    }
}
