package com.github.jrollin;

public class Kata {

    private Integer difficulty = 0;


    public void increaseDifficulty() {
        difficulty++;
    }

    public Integer getDifficulty() {
        return difficulty;
    }
}