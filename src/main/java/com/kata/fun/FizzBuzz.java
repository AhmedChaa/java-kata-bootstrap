package com.kata.fun;

public class FizzBuzz {
    public String proceed(int number) {
        String result = "";
        if (number % 3 == 0) {
            result += "fizz";
        }
        if (number % 5 == 0) {
            result += "buzz";
        }
        return result.length() > 0 ? result : String.valueOf(number);
    }
}
