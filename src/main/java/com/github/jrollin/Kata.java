package com.github.jrollin;

import sun.reflect.generics.tree.VoidDescriptor;

public class Kata {

    private Integer difficulty = 0;


    public void increaseDifficulty() {
        difficulty++;
    }

    public Integer getDifficulty() {
        return difficulty;
    }
}