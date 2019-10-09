package com.github.jrollin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Kata usecase")
public class KataTest {

    private Kata kata;

    @BeforeEach
    public void setup() {
        kata = new Kata();
    }

    @Test
    @DisplayName("difficulty is zero at start")
    void difficultyShouldBeZero() {
        assertEquals(0, kata.getDifficulty());
    }

    @Test
    @DisplayName("can increase difficulty by one")
    void difficultyShouldIncreaseByOne() {
        kata.increaseDifficulty();
        assertEquals(1, kata.getDifficulty());
    }
}

